package java.com.surveillance.pages;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.testng.Assert;

import com.surveillance.db.utilitiy.OracleDatabaseUtils;
import com.surveillance.utilitiy.PropertySingleton;

public class DBRepo {

	PropertySingleton _propertySingleton = null;
	String hosturl = null;
	String User = null;
	String PSWD = null;

	public DBRepo() {
		_propertySingleton = PropertySingleton.getInstance();
		hosturl = _propertySingleton.getValue("HOST");
		User = _propertySingleton.getValue("UN");
		PSWD = _propertySingleton.getValue("PWD");
		OracleDatabaseUtils.connectToOracleDB(hosturl, User, PSWD);
	}


	public List<Map<String, String>> getAllDBDetails(String selectQuery) throws Exception {
		List<Map<String,String>> list = new ArrayList<Map<String,String>>();
		try {
			 ResultSet resultSet = OracleDatabaseUtils.executeSelectQuery(selectQuery);
			 int columnCount = resultSet.getMetaData().getColumnCount();
	         List<String> columnsList = new ArrayList<String>();
	         ResultSetMetaData metaData = resultSet.getMetaData();
	       
	         for (int columnCounter = 1; columnCounter <= columnCount; columnCounter++) {
			   columnsList.add(metaData.getColumnLabel(columnCounter));
			}
	     
		    Map<String,String> map = new HashMap<String,String>();
	
			while (resultSet.next()) {
				for (int j = 1; j <= columnsList.size(); j++) {
					String columnLabel = (String) columnsList.get(j - 1);
					map.put(columnLabel, resultSet.getString(columnLabel));
	//				System.out.println(columnLabel+"--->"+resultSet.getString(columnLabel));
				}
				list.add(map);
			}
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
			
		} finally {
			OracleDatabaseUtils.closeConnection(OracleDatabaseUtils.conn);
		}
		return list;

	}

	public void CompareResult(List<Map<String, String>> dBData, List<Map<String, String>> excelData, String uniqueKey)
			throws Exception {

		for (int i = 1; i < excelData.size(); i++) {
			Map<String, String> excelRowData = excelData.get(i);
			String excelUniqueValue = excelRowData.get(uniqueKey);
			System.out.println("Primary key value in Excel is " + excelUniqueValue);

			for (int j = 0; j < dBData.size(); j++) {
				Map<String, String> dbRowData = dBData.get(j);
				String dbUniqueValue = dbRowData.get(uniqueKey.toUpperCase());
				System.out.println("Primary key value in DB is " + dbUniqueValue);

				if (excelUniqueValue != null && dbUniqueValue != null && dbUniqueValue.equals(excelUniqueValue)) {

					for (String eachColumn : excelRowData.keySet()) {
						System.out.println("Excel Value: " + excelRowData.get(eachColumn) + " and" + " DB Value: "
								+ dbRowData.get(eachColumn.toUpperCase()));
						// TODO: Need to check from 2nd column
						if (excelRowData.get(eachColumn) != null && dbRowData.get(eachColumn.toUpperCase()) != null)
							Assert.assertTrue(excelRowData.get(eachColumn)
									.equalsIgnoreCase(dbRowData.get(eachColumn.toUpperCase())));
					}

					Collection<String> Exvalues = excelData.get(i).values();

					// Creating an ArrayList of values
					ArrayList<String> XLlistOfValues = new ArrayList<String>(Exvalues);

					// Collections.sort(EXlistOfValues);
					Collection<String> DBvalues = dBData.get(j).values();

					// Creating an ArrayList of values
					ArrayList<String> DBlistOfValues = new ArrayList<String>(DBvalues);
					System.out.println("XL data in if condition" + XLlistOfValues);
					System.out.println("DB data in if condition" + DBlistOfValues);
					System.out.print("Mapped TestData with DB Data is : " + XLlistOfValues.stream()
							.map(String::toUpperCase).filter(DBlistOfValues::contains).collect(Collectors.toList()));

					//break;
				}
			}
			//break;
		}

	}
	
	
}
