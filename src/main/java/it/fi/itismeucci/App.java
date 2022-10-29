package it.fi.itismeucci;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import it.fi.itismeucci.pojo.Builder;
import it.fi.itismeucci.pojo.Classe;

/**
 * Per far funzionare la serializzazione/deserializzazione xml
 * è necessario aggiungere al pom.xml la seguente dependency:
 * <pre>
 * {@code
 * <dependency>
 *  <groupId>com.fasterxml.jackson.dataformat</groupId>
 *  <artifactId>jackson-dataformat-xml</artifactId>
 *  <version>2.13.3</version>
 * </dependency>
 * }
 * </pre>
 * 
 * 
 * Per far funzionare la serializzazione/deserializzazione json
 * è necessario aggiungere al pom.xml la seguente dependency:
 * <pre>
 * {@code
 * <dependency>
 *  <groupId>com.fasterxml.jackson.core</groupId>
 *  <artifactId>jackson-databind</artifactId>
 *  <version>2.13.3</version>
 * </dependency>    
 * }
 * </pre>

 */
public class App {


    public static String serializzaPojoSuXml(Classe c) {
        try {
            // istanzio la classe che serilizza/deserializza xml
            XmlMapper xmlMapper = new XmlMapper();
            // serializzo il pojo in input al metodo su xml
            String xml = xmlMapper.writeValueAsString(c);
            return xml;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Classe deserializzaXml(String xml) {
        try {
            // istanzio la classe che serilizza/deserializza xml
            XmlMapper xmlMapper = new XmlMapper();
            // deserializzo l'xml in input in una classe, specificando il tipo (Classe.class)
            Classe c = xmlMapper.readValue(xml, Classe.class);
            return c;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }


    public static String serializzaPojoSuJson(Classe c) {
        try {
            // istanzio la classe che serilizza/deserializza json
            ObjectMapper jsonMapper = new ObjectMapper();
            // serializzo il pojo in input al metodo su xml
            String json = jsonMapper.writeValueAsString(c);
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Classe deserializzaJson(String json) {
        try {
            // istanzio la classe che serilizza/deserializza json
            ObjectMapper jsonMapper = new ObjectMapper();
            // deserializzo il json in input in una classe, specificando il tipo (Classe.class)
            Classe c = jsonMapper.readValue(json, Classe.class);
            return c;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }



    public static void main(String[] args) {

        // 1) inizializzo un pojo di esempio
        Classe c1 = Builder.inizializzaClasse();

        System.out.println("---------------------\n");
        // 2) serializzo il pojo su xml
        String xml = serializzaPojoSuXml(c1);
        System.out.println("Pojo serializzato su xml:");
        System.out.println(xml);
        System.out.println("---------------------\n");

        // 3) deserializzo l'xml nel pojo
        Classe c2 = deserializzaXml(xml);
        System.out.println("Pojo deserializzato da xml:");
        System.out.println(c2);
        System.out.println("---------------------\n");

        // 4) serializzo il pojo su json
        String json = serializzaPojoSuJson(c1);
        System.out.println("Pojo serializzato su json:");
        System.out.println(json);
        System.out.println("---------------------\n");

        // 3) deserializzo l'json nel pojo
        Classe c3 = deserializzaJson(json);
        System.out.println("Pojo deserializzato da json:");
        System.out.println(c3);



    }
}
