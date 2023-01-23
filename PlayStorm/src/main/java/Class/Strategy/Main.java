/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Class.Strategy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorge
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        // Crear una lista de juegos
        List<Game> games = new ArrayList<>();
        games.add(new Game("Game 1", "Action", 15.99));
        games.add(new Game("Game 2", "Adventure", 20.99));
        games.add(new Game("Game 3", "Action", 10.99));
        games.add(new Game("Game 4", "RPG", 30.99));

        // Crear una instancia de Finder
        Finder finder = new Finder();

        // Buscar juegos por categoría
        finder.setSearchStrategy(new SearchByCategory());
        List<Game> result = finder.search(games, "Action");
        System.out.println("Juegos de acción:");
        for (Game game : result) {
            System.out.println(game.getName());
        }

        // Buscar juegos por nombre
        finder.setSearchStrategy(new SearchByName());
        result = finder.search(games, "2");
        System.out.println("Juegos con el número 2 en su nombre:");
        for (Game game : result) {
            System.out.println(game.getName());
        }

        // Buscar juegos por precio
        finder.setSearchStrategy(new SearchByPrice());
        result = finder.search(games, "20.99");
        System.out.println("Juegos con precio menor de 20.99:");
        for (Game game : result) {
            System.out.println(game.getName());
        }

        // Buscar juegos por precio y por nombre
        finder.setSearchStrategy(new SearchByPrice());
        result = finder.search(games, "20.99");
        finder.setSearchStrategy(new SearchByName());
        result = finder.search(result, "3");
        System.out.println("Juegos con precio menor de 20.99 con nombre 1:");
        for (Game game : result) {
            System.out.println(game.getName());
        }
    }

    /**
     *
     * @param games
     * @return
     */
    public List<Game> ordenarPreferencia(List<Game> games) {
        List<Game> lista = new ArrayList<>();
        List<Game> lista2 = new ArrayList<>();
        List<Game> listaFinal = new ArrayList<>();

        for (Game game : games) {
            if (game instanceof Game) {
                lista.add(game);
            } else {
                lista2.add(game);
            }
        }

        for (Game game : lista) {
            listaFinal.add(game);
        }

        for (Game game : lista2) {
            listaFinal.add(game);
        }

        return listaFinal;
    }
}
