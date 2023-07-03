import java.util.HashMap;
import java.util.Map;

public class TabelaBrasileirao {
    private Map<String, int[]> times;

    public TabelaBrasileirao() {
        times = new HashMap<>();
    }

    public void adicionarResultado(String time1, int gols1, String time2, int gols2) {
        if (!times.containsKey(time1)) {
            times.put(time1, new int[]{0, 0, 0, 0, 0, 0, 0});
        }
        if (!times.containsKey(time2)) {
            times.put(time2, new int[]{0, 0, 0, 0, 0, 0, 0});
        }

        int[] statsTime1 = times.get(time1);
        int[] statsTime2 = times.get(time2);

        if (gols1 > gols2) {
            statsTime1[0]++;  // vitórias time1
            statsTime2[2]++;  // derrotas time2
        } else if (gols1 < gols2) {
            statsTime2[0]++;  // vitórias time2
            statsTime1[2]++;  // derrotas time1
        } else {
            statsTime1[1]++;  // empates time1
            statsTime2[1]++;  // empates time2
        }

        statsTime1[3] += (gols1 > gols2) ? 3 : (gols1 == gols2) ? 1 : 0;  // pontos time1
        statsTime2[3] += (gols2 > gols1) ? 3 : (gols1 == gols2) ? 1 : 0;  // pontos time2
        statsTime1[4] += gols1;  // gols pró time1
        statsTime2[4] += gols2;  // gols pró time2
        statsTime1[5] += gols2;  // gols contra time1
        statsTime2[5] += gols1;  // gols contra time2
        statsTime1[6] = statsTime1[4] - statsTime1[5];  // saldo de gols time1
        statsTime2[6] = statsTime2[4] - statsTime2[5];  // saldo de gols time2
    }

    public Map<String, int[]> getTimes() {
        return times;
    }
}
