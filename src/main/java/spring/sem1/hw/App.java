package spring.sem1.hw;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Создаем наши объекты
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person("Иван", "Иванов", 27);
        Person person2 = new Person("Дмитрий", "Будяков", 30);
        Person person3 = new Person("Петр", "Петров", 35);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        // исходные данные
        System.out.println("Исходные данные:");
        System.out.println(personList);
        System.out.println();

        // Gson сериализация
        System.out.println("Сериализация:");
        String json = saveData(personList);
        System.out.println(json);

        System.out.println();

        // Gson десериализация
        System.out.println("Десериализация:");
        List<Person> restoredList = restoreData(json);

        System.out.println(restoredList);
        System.out.println();


    }

    /**
     * Десериализация данных
     * @param json
     * @return
     */
    private static List<Person> restoreData(String json) {
        List<Person> restoredList = new Gson().fromJson(json, ArrayList.class);
        return restoredList;
    }

    /**
     * Сериализация данных
     * @param personList
     * @return
     */
    private static String saveData (List<Person> personList) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(personList);
        return json;
    }


}
