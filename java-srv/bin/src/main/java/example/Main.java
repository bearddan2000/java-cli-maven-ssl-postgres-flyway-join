package example;

import org.apache.log4j.PropertyConfigurator;

// Notice, do not import com.mysql.jdbc.*
// or you will have problems!

public class Main {

  public static void main(String[] args) {
    PropertyConfigurator.configure("log4j.xml");
    final String connectionStr = "jdbc:postgresql://db/animal?user=maria&password=pass";

    example.chain.ILink obj = new example.chain.Driver();

    if (obj.hasResource("org.postgresql.Driver", connectionStr)){
      example.db.print.output.IOutput output = new example.db.print.output.ToFile();
      for ( String tbl : new String[]{"\"public\".\"dog\"", "\"public\".\"breedLookup\""
      , "\"public\".\"colorLookup\"", "\"public\".\"dog_expanded\""})
        example.db.DBQuery.query(connectionStr, tbl, output);
    }
  }
}
