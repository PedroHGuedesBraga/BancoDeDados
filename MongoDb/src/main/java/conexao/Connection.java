package conexao;
import com.mongodb.DB;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;


public class Connection {
    DB BaseDados;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();

    public Connection(){
        try{
            Mongo mongo = new Mongo("localhost",27017);
            BaseDados = mongo.getDB("admin");
            collection = BaseDados.getCollection("filme");
            System.out.println("Conexão efetuada");
        } catch(Exception e){
            System.out.println(e+"Erro");
        }
    public boolean inserir (String Dado){
            document.put("Filme",Dado);
            collection.insert(document)

        }
    }
}
