import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class TariffLoader {
    private final String RATE_BASE = "\\src\\main\\resources\\rateTariff.csv";
    private BufferedReader reader;
    private Tariff tariff;
    private ArrayList<Tariff> tariffLine;
    private LinkedHashMap<String, ArrayList<Tariff>> allTariffGroupByTariffLine;
    private String line;


    private int unlimCheck(String lineValue) {
        if (!lineValue.equalsIgnoreCase("unlim")) {
            return Integer.parseInt(lineValue);
        }
        else return Integer.MAX_VALUE;
    }

    private void tariffSetter(String[] values) {
        tariff.setTariffName(values[0]);
        tariff.setSubscriptionFee(Double.parseDouble(values[1]));
        tariff.setFreeMinute(unlimCheck(values[2]));
        tariff.setFreeMinuteToOtherNetwork(unlimCheck(values[3]));
        tariff.setFreeTraffic(unlimCheck(values[4]));
        tariff.setFreeSms(unlimCheck(values[5]));
        tariff.setFreeMinuteRoaming(unlimCheck(values[6]));
        tariff.setPriceMinute(Double.parseDouble(values[7]));
        tariff.setPriceMinuteToOtherNetwork(Double.parseDouble(values[8]));
        tariff.setPriceTraffic(Double.parseDouble(values[9]));
        tariff.setPriceSms(Double.parseDouble(values[10]));
        tariff.setPriceMinuteRoaming(Double.parseDouble(values[11]));
    }

    LinkedHashMap<String, Tariff> loadAllTariffFromCsv() throws IOException {
        tariffLine = new ArrayList<>();
        allTariffGroupByTariffLine = new LinkedHashMap<>();
        reader = new BufferedReader(new FileReader(RATE_BASE));
        while ((line = reader.readLine()) != null) {
            String[] values = line.split("_");
            tariffSetter(values);
            allTariffGroupByTariffLine.put(tariff.getTariffName(), tariffLine);
            allTariffGroupByTariffLine.put(tariff.getTariffName().split(" ")[0], ;
        }
        return allTariff;
    }

    LinkedHashMap<String, LinkedHashMap<String, Tariff>>
}
