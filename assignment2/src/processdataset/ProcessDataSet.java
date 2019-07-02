package processdataset;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.text.NumberFormat;

public class ProcessDataSet
{
    public static void main(String[] args)
    {
        ArrayList<String> assistant = new ArrayList <String>();
        ArrayList<String> associate = new ArrayList <String>();
        ArrayList<String> full      = new ArrayList <String>();
        String home = System.getProperty("user.home");

        File salaryFile       = new File(home + "/Downloads/assignment2/src/processdataset/salary.txt");
        StringBuilder line    = new StringBuilder();
        BufferedReader reader = null;

        try
        {
            reader = new BufferedReader(new FileReader(salaryFile));
            String text = null;

            while((text = reader.readLine()) != null)
            {
                String[] array = text.split(" ");
                String professor = array[2];

                if (professor.equalsIgnoreCase("assistant"))
                {
                    assistant.add(text);
                }
                else if (professor.equalsIgnoreCase("associate"))
                {
                    associate.add(text);
                }
                else if (professor.equalsIgnoreCase("full"))
                {
                    full.add(text);
                }

                line.append(text)
                        .append(System.getProperty("line.separator"));
            }

            double totalAssistantSalary = 0.0;

            for (int i = 0; i < assistant.size(); i++)
            {
               String assistantLine = assistant.get(i);
                String[] array = assistantLine.split(" ");
                String salaryStr = array[3];
                double salary = Double.parseDouble(salaryStr);
                totalAssistantSalary += salary;
            }
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            double assistantAverage = (totalAssistantSalary / assistant.size());

            double totalAssociateSalary = 0.0;

            for (int i = 0; i < associate.size(); i++)
            {
                String associateLine = associate.get(i);
                String[] array = associateLine.split(" ");
                String salaryStr = array[3];
                double salary = Double.parseDouble(salaryStr);
                totalAssociateSalary += salary;
            }

            System.out.println(formatter.format(totalAssociateSalary));
            double associateAverage = (totalAssociateSalary / associate.size());
            System.out.println(formatter.format(associateAverage));

            double totalFullSalary = 0.0;

            for (int i = 0; i < full.size(); i++)
            {
                String fullLine = full.get(i);
                String[] array = fullLine.split(" ");
                String salaryStr = array[3];
                double salary = Double.parseDouble(salaryStr);
                totalFullSalary += salary;
            }

            System.out.println(formatter.format(totalFullSalary));
            double fullAverage = (totalFullSalary / full.size());
            System.out.println(formatter.format(fullAverage));

            double totalSalary = (totalAssistantSalary + totalAssociateSalary + totalFullSalary);
            double average     = (totalSalary / 3);

            System.out.println("\t\t\t\tTotal\t\t\t\tAverage");
            System.out.println("____________________________________________________________");
            System.out.println("\nAssistant\t|\t" + formatter.format(totalAssistantSalary) + "\t\t" + formatter.format(assistantAverage));
            System.out.println("Associate\t|\t" + formatter.format(totalAssociateSalary) + "\t\t" + formatter.format(associateAverage));
            System.out.println("Full\t\t|\t" + formatter.format(totalFullSalary) + "\t\t" + formatter.format(fullAverage));
            System.out.println("All Faculty\t|\t" + formatter.format(totalSalary) + "\t\t" + formatter.format(average));
        }


        catch (FileNotFoundException e)
        {
            e.printStackTrace( );
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }

        finally
        {
            try
            {
                if(reader != null)
                {
                    reader.close();
                }
            }

            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}