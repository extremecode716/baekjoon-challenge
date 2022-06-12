package baekjoon.problem.p1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 나는야 포켓몬 마스터 이다솜
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/1620">https://www.acmicpc.net/problem/1620</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    static class Pokemon {
        private String no;
        private String name;

        public Pokemon(String no, String name) {
            this.no = no;
            this.name = name;
        }

        public String getNo() {
            return no;
        }

        public String getName() {
            return name;
        }
    }

    static class PokemonIndex {
        private final Map<String, Pokemon> pokemonNos = new HashMap<>(); // no, pokemon
        private final Map<String, Pokemon> pokemonNames = new HashMap<>(); // name, pokemon

        public void put(String no, String name) {
            final Pokemon pokemon = new Pokemon(no, name);
            pokemonNos.put(no, pokemon);
            pokemonNames.put(name, pokemon);
        }

        public String findNameByNo(String no) {
            final Pokemon pokemon = pokemonNos.get(no);
            if (pokemon == null) return "";
            return pokemon.getName();
        }

        public String findNoByName(String name) {
            final Pokemon pokemon = pokemonNames.get(name);
            if (pokemon == null) return "";
            return pokemon.getNo();
        }
    }

    private static void solution() {
        final String[] input = Algorithm.readLine().split(" ");
        final int N = Integer.parseInt(input[0]);
        final int M = Integer.parseInt(input[1]);
        final PokemonIndex pokemonIndex = new PokemonIndex();

        for (int i = 1; i <= N; ++i) {
            pokemonIndex.put(String.valueOf(i), Algorithm.readLine());
        }

        final StringJoiner stringJoiner = new StringJoiner("\n");
        for (int i = 0; i < M; ++i) {
            final String inputNoOrName = Algorithm.readLine();
            final boolean isNumeric = inputNoOrName.chars().allMatch(Character::isDigit);
            if (isNumeric) {
                stringJoiner.add(pokemonIndex.findNameByNo(inputNoOrName));
            } else {
                stringJoiner.add(pokemonIndex.findNoByName(inputNoOrName));
            }
        }

        System.out.println(stringJoiner);
    }
}

/**
 * 백준에 제출하기 위해 문제의 Main 클래스로 복사 이동하여 사용됩니다.
 *
 * @author extreme code
 */
class Algorithm {
    @FunctionalInterface
    public interface Solution {
        void solve();
    }

    private static BufferedReader bufferedReader;

    public static String readLine() {
        bufferedReader = bufferedReader == null ? new BufferedReader(new InputStreamReader(System.in)) : bufferedReader;
        String line = null;
        try {
            line = bufferedReader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return line;
    }

    public static List<String> readLines(final int readCount) {
        bufferedReader = bufferedReader == null ? new BufferedReader(new InputStreamReader(System.in)) : bufferedReader;
        List<String> lines = new ArrayList<>();
        try {
            int count = 0;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
                ++count;
                if (count == readCount)
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static void close() {
        if (null == bufferedReader)
            return;
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader = null;
        }
    }

    public static void solve(Solution solution) {
        solution.solve();
        close();
    }
}