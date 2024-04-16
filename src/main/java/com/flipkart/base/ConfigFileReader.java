package main.java.com.flipkart.base;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
    private final Properties properties; //Predefined class in Java inherits from Hashtable and store data in form of key value

    public ConfigFileReader()
    {
        BufferedReader bufferedReader;
        String propertyFilePath = "C:\\Users\\HP\\IdeaProjects\\SeleniumProject\\Configuration\\Config.properties";
        try
        {
            bufferedReader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try
            {
                properties.load(bufferedReader);
                bufferedReader.close();
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        catch(FileNotFoundException fe)
        {
            fe.printStackTrace();
            throw new RuntimeException("config.properties not found"+ propertyFilePath);
        }
    }
   /*
This method we need when we are not using mvn repository for driver extension
 */
   public String getDriverPath() {
       String driverPath = properties.getProperty("driverPath");
       if (driverPath != null) return driverPath;
       else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
   }

    public long getImplicitlyWait()
    {
        String implicitlyWait = properties.getProperty("implicitlyWait");
        if(implicitlyWait!=null) return Long.parseLong(implicitlyWait);
        else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
    }

    public String getApplicationUrl()
    {
        String url = properties.getProperty("url");
        if(url!=null) return url;
        else throw new RuntimeException("url not specified in the Configuration.properties file.");
    }


}
