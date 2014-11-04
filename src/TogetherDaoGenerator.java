import java.io.IOException;


import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class TogetherDaoGenerator {

	/**
	 * @param args
	 *
	 * 
	 */
	public static void main(String[] args) throws IOException, Exception {
		// TODO 自动生成的方法存根
		Schema schema = new Schema(1000, "db.greendao.together");
		addUserInfo(schema) ;
		addFriends(schema) ;
		
		new DaoGenerator().generateAll( schema, "../Together/src");
 	}

	private static void addFriends(Schema schema) {
		Entity friends= schema.addEntity("Friends") ;
		friends .addStringProperty("userId" ) ;
	}

	private static void addUserInfo(Schema schema) {
		Entity userInfo = schema.addEntity( "UserInfoBean" ) ;
		userInfo.addStringProperty("userId_lower") ;
		userInfo.addStringProperty( "userId" ) ; 
		userInfo.addStringProperty("name") ;
		userInfo.addStringProperty("headPhoto") ;
		
		userInfo.addStringProperty("registerDate") ;
		userInfo.addStringProperty("sex") ;
		userInfo.addStringProperty("birthday") ;
		userInfo.addStringProperty("salary") ;
		userInfo.addStringProperty("address") ;
		userInfo.addStringProperty("job") ;
		userInfo.addStringProperty("position") ;
		userInfo.addStringProperty("marriage") ;
		userInfo.addStringProperty("hobby") ;
		userInfo.addStringProperty("sign") ;
	}

}
