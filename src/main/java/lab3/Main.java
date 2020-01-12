package lab3;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import lab3.controller.UniversityCreator;
import lab3.model.University;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main  {
    private static final String PATH = "src/main/resources/un.json";

    public static void main(String[] args) throws IOException {
        UniversityCreator universityCreator = new UniversityCreator(new Scanner(System.in));
        University university = universityCreator.createUniversity();
        System.out.println(university.toString());
        Gson gson = new Gson();
        String json = gson.toJson(university);
        File file = new File(PATH);
        FileWriter fileWriter = new FileWriter(file);

        fileWriter.write(json);
        fileWriter.flush();
        fileWriter.close();
        JsonReader jsonReader = new JsonReader(new FileReader(file));
        University formJsonUniversity = gson.fromJson(jsonReader, University.class);

        if (university.equals(formJsonUniversity)){
            System.out.println("EQUALS!!");
        }

    }
}
