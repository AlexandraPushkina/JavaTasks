package Homework4;

import java.util.HashMap;

public class ArrayWords {
    public String[] array;


    public ArrayWords(String[] array) {
        this.array = array;
    }
    //Создаем хэш-таблицу
    HashMap<String, Integer> wordCounts = new HashMap<>();


    public void getWordsCount() {
       for (String word:array ){
           if (!wordCounts.containsKey(word)){
               wordCounts.put(word, 1);
           }
           else {
               wordCounts.put(word, wordCounts.get(word) + 1);
           }
       }
    }

    public void printWordsCount() {
        for (HashMap.Entry<String, Integer> word : wordCounts.entrySet()) {
            System.out.println(word);
        }
    }

    public void printUniqueCount(){
        for (HashMap.Entry<String, Integer> word : wordCounts.entrySet()) {
            if (word.getValue() == 1) {
                System.out.println(word);
            }
        }
    }

}
