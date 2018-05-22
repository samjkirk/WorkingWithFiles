import java.io.*;
import java.util.ArrayList;

public class WorkingWithFiles {
    private BufferedWriter bw = null;
    BufferedReader reader = null;
    private String content;
    String tempReaderLine;

    public void writeToFile(ArrayList<Person> listOfPeople){
        System.out.println("Attempting to write to file...");
        try {
            File output = new File("C:\\Users\\Profile\\Documents\\test5.txt");

            if (!output.exists()) {
                output.createNewFile();
            } else {
                System.out.println("File already exists...");
            }

            FileWriter fw = new FileWriter(output);
            bw = new BufferedWriter(fw);

            for (Person person : listOfPeople){
                content = person.toString(person) + "\n";
                bw.write(content);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        finally {
            try {
                if(bw!=null)
                    bw.close();
            } catch (Exception ex) {
                System.out.println("Error in closing the BufferedWriter" + ex);
            }
        }
    }

    public void readFromFile(ArrayList<Person> infoReadFromFile){
        System.out.println("Attempting to read from file...");
        try {
            File file = new File("C:\\Users\\Profile\\Documents\\test5.txt");
            reader = new BufferedReader(new FileReader(file));

            String line;
            while ((line = reader.readLine()) != null) {
                tempReaderLine = line;
                String[] tempReaderArray = tempReaderLine.split(",");
                String tempName = tempReaderArray[0];
                String tempOccupation = tempReaderArray[1];
                String tempAge = tempReaderArray[2];
                tempAge = tempAge.substring(6);
                infoReadFromFile.add(new Person(tempName.substring(5), tempOccupation.substring(12), Integer.parseInt(tempAge)));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
