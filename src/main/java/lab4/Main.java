
package lab4;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import lab4.controller.AddressCreator;
import lab4.controller.CitizenCreator;
import lab4.model.Address;
import lab4.model.Citizen;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    private static final String PATH_STREETS = "src/main/resources/streets.json";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        CitizenCreator citizenCreator = new CitizenCreator(scanner);

        System.out.println("Enter count citizens what are you need add: ");
        int count =  scanner.nextInt();
        System.out.println("Enter the letter with which street names should begin: ");
        char choiceLetter = scanner.next().charAt(0);
        ArrayList<Citizen> citizens = new ArrayList<>();
        IntStream.of(1, count).forEach(iterator -> citizens.add(citizenCreator.createCitizen()));
//        not work citizens.getAddress() and addressOnStream.getCity()
//        Set<String> streets = citizens.getAddress().stream()
//                .filter(addressOnStream -> addressOnStream.getCity().toCharArray()[0] == choiceLetter)
//                .map(Address :: getStreet)
//		.collect(Collectors.toSet());

        Gson gson = new Gson();
//        String json = gson.toJson(streets);
        File file = new File(PATH_STREETS);
        FileWriter fileWriter = new FileWriter(file);

//        fileWriter.write(json);
        fileWriter.flush();
        fileWriter.close();
    }
}
