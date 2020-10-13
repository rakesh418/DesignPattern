import java.util.ArrayList;
import java.util.List;

class Journal{
    List<String> journalList = new ArrayList<>();
    int count =0;

    public void add(String journal){
        journalList.add(""+ count++ + " : "+journal);
    }

    public void remove(int index){
        journalList.remove(index);
    }

    @Override
    public String toString() {
        return "Journal{" +
                "journalList=" + journalList +
                ", count=" + count +
                '}';
    }
}


public class SRPClass {
    public static void main(String[] args) {
        Journal journal = new Journal();
        journal.add("Microservices");
        journal.add("Kafka");
        System.out.println(journal);
    }
}

