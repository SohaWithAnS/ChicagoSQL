public final class Constants 
{	
	public static final int pageSize = 512;
	public static final String datePattern = "yyyy-MM-dd_HH:mm:ss";
	public static final String catalogDir = "data/catalog/";
	public static final String userDataDir = "data/user_data/";
	
	//catalog filenames
	public static final String TABLE_CATALOG = "davisbase_tables";
	public static final String COLUMN_CATALOG = "davisbase_columns";
	
	//page types
	public static final int recordsPage = 0x0D;
	
	//data types
	
	
	//NULL
	public static final byte NULL = 0x00;
	//public static final byte SHORTNULL = 0x01;
	//public static final byte INTNULL = 0x02;
	//public static final byte LONGNULL = 0x03;
	
	//Numeric
	public static final byte TINYINT = 0x01;
	public static final byte SMALLINT = 0x02;
	public static final byte INT = 0x03;
	public static final byte BIGINT = 0x04;
	public static final byte LONG = 0x04;
	public static final byte FLOAT = 0x05;
	public static final byte DOUBLE = 0x06;
	
	//DateTime
	public static final byte YEAR = 0x08;
	public static final byte TIME = 0x09; 
	public static final byte DATETIME = 0x0A;
	public static final byte DATE = 0x0B;
	
	//TEXT
	public static final byte TEXT = 0x0C;
	
	public static final String PROMPT = "chicagosql> ";
	public static final String VERSION = "1.0";
	
	// ???
	public static final int PAGE_SIZE = 512;
	public static final int TABLE_OFFSET = PAGE_SIZE - 24;
	public static final int COLUMN_OFFSET = TABLE_OFFSET - 25;
	
	//math operators
	public static final String EQUALS_SIGN = "=";
	public static final String LESS_THAN_SIGN = "<";
	public static final String GREATER_THAN_SIGN = ">";
	public static final String LESS_THAN_EQUAL_SIGN = "<=";
	public static final String GREATER_THAN_EQUAL_SIGN = ">=";
	public static final String NOT_EQUAL_SIGN = "!=";

	//file type extensions for table file and index file
	public static final String FILE_TYPE = ".tbl";
	public static final String INDEX_FILE_TYPE = ".ndx";
	
	//table headers
	public static final String HEADER_ROWID = "rowid";
	public static final String HEADER_TABLE_NAME = "table_name";
	public static final String HEADER_TEXT = "TEXT";
	public static final String HEADER_IS_UNIQUE = "is_unique";
	public static final String HEADER_IS_NULLABLE = "is_nullable";
	
	//boolean strings
	public static final String FALSE = "NO";
	public static final String TRUE = "TRUE";
	
	private Constants(){
		throw new AssertionError();
	}
}
