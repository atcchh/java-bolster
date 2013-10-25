package org.lufax.sql.generator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import oracle.sql.TIMESTAMP;

public class SQLGenerator {
    public static void main(String[] argu) throws Exception {
        String url = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS=(PROTOCOL=tcp)(HOST=172.17.40.56)(PORT=1521))(connect_data=(sid=ies)))";
        String driverClassName = "oracle.jdbc.driver.OracleDriver";
        String username = "p2popr";
        String password = "p2popr";
        Class.forName(driverClassName).newInstance();
        Connection conn = DriverManager.getConnection(url, username, password);
        
//        String sql = "select * from TRANSACTION_HISTORY where account_id = 1501551 and rownum <= 20 union all select * from TRANSACTION_HISTORY where account_id = 1724142 and rownum <= 10  union all select * from TRANSACTION_HISTORY where account_id = 1724151 and rownum <= 10";
//        String sql = "  select * from withdraw_records where status = 'SUCCESS' and rownum <= 20 union  select * from withdraw_records where status = 'PROCESSING' and rownum <= 20  union  select * from withdraw_records where status = 'FAILURE' and rownum <= 20  union  select * from withdraw_records where status = 'NEW' and rownum <= 20";
//        String sql = " select * from cms_capital_statements where statement_type = 'WITHDRAWAL' and detail_type = 'CUSTOMER_WITHDRAWAL' and rownum <= 10 union all " +  
//                     " select * from cms_capital_statements where statement_type = 'WITHDRAWAL' and detail_type = 'LOAN_GRANTING' and rownum <= 10 union all " + 
//                     " select * from cms_capital_statements where statement_type = 'RECHARGE' and detail_type = 'CUSTOMER_RECHARGE' and rownum <= 10 union all " + 
//                     " select * from cms_capital_statements where statement_type = 'RECHARGE' and detail_type = 'WITHHOLD_RECHARGE' and rownum <= 10 union all " + 
//                     " select * from cms_capital_statements where statement_type = 'RECHARGE' and detail_type = 'RETRY_RECHARGE' and rownum <= 10 union all " + 
//                     " select * from cms_capital_statements where statement_type = 'RECHARGE' and detail_type = 'SUBROGATE_RECHARGE' and rownum <= 10 union all " + 
//                     " select * from cms_capital_statements where statement_type = 'WITHDRAWAL' and detail_type = 'WITHDRAWAL' and rownum <= 10 union all " + 
//                     " select * from cms_capital_statements where statement_type = 'VERIFICATION' and detail_type = 'VERIFICATION_FEE' and rownum <= 10 union all " +  
//                     " select * from cms_capital_statements where statement_type = 'RECHARGE' and detail_type = 'CUSTOMER_WITHDRAWAL' and rownum <= 10 union all " + 
//                     " select * from cms_capital_statements where statement_type = 'RECHARGE' and detail_type = 'AUTO_RECHARGE' and rownum <= 10 union all " + 
//                     " select * from cms_capital_statements where statement_type = 'WITHDRAWAL' and detail_type = 'GUARANTOR_WITHDRAWAL' and rownum <= 10 union all" +  
//                     " select * from cms_capital_statements where statement_type = 'WITHDRAWAL' and detail_type = 'MANUAL_GRANTING' and rownum <= 10 ";
//        String sql = " select * from account_capital_statements where channel_id = 'BE' and statement_type = 'RECHARGE'  and rownum <=10 union all " + 
//                " select * from account_capital_statements where channel_id = 'BE_SME' and statement_type = 'RECHARGE'  and rownum <=10 union all " + 
//                " select * from account_capital_statements where channel_id = 'P2P' and statement_type = 'RECHARGE'  and rownum <=10 union all " + 
//                " select * from account_capital_statements where channel_id = 'P2P' and statement_type = 'WITHDRAW'  and rownum <=10 union all " + 
//                " select * from account_capital_statements where channel_id = 'BE' and statement_type = 'WITHDRAW'  and rownum <=10 union all " + 
//                " select * from account_capital_statements where channel_id = 'ANSHUO' and statement_type = 'WITHDRAW'  and rownum <=10 union all " + 
//                " select * from account_capital_statements where channel_id = 'IOS' and statement_type = 'RECHARGE'  and rownum <=10 union all " + 
//                " select * from account_capital_statements where channel_id = 'MEMBER' and statement_type = 'RECHARGE'  and rownum <=10 union all " + 
//                " select * from account_capital_statements where channel_id = 'ANSHUO' and statement_type = 'RECHARGE'  and rownum <=10 union all " + 
//                " select * from account_capital_statements where channel_id = 'IOS' and statement_type = 'WITHDRAW'  and rownum <=10 ";
        String sql = 
                " select  * from recharge_records where recharge_type = 'OFFFLINE' and recharge_status = 'SUCCESS' and rownum <=10 union all " + 
                        " select  * from recharge_records where recharge_type = 'CMS' and recharge_status = 'SUCCESS' and rownum <=10 union all " + 
                        " select  * from recharge_records where recharge_type = 'WITHHOLD' and recharge_status = 'PROCESSING' and rownum <=10 union all " + 
                        " select  * from recharge_records where recharge_type = 'SUBROGATE' and recharge_status = 'FAILURE' and rownum <=10 union all " + 
                        " select  * from recharge_records where recharge_type = 'CMS' and recharge_status = 'NEW' and rownum <=10 union all " + 
                        " select  * from recharge_records where recharge_type = 'CMS' and recharge_status = 'FAILURE' and rownum <=10 union all " + 
                        " select  * from recharge_records where recharge_type = 'AUTO' and recharge_status = 'FAILURE' and rownum <=10 union all " + 
                        " select  * from recharge_records where recharge_type = 'AUTO' and recharge_status = 'NEW' and rownum <=10 union all " + 
                        " select  * from recharge_records where recharge_type = 'WITHHOLD' and recharge_status = 'NEW' and rownum <=10 union all " + 
                        " select  * from recharge_records where recharge_type = 'AUTO' and recharge_status = 'SUCCESS' and rownum <=10 union all " + 
                        " select  * from recharge_records where recharge_type = 'WITHHOLD' and recharge_status = 'SUCCESS' and rownum <=10 union all " + 
                        " select  * from recharge_records where recharge_type = 'SUBROGATE' and recharge_status = 'SUCCESS' and rownum <=10 union all " + 
                        " select  * from recharge_records where recharge_type = 'SUBROGATE' and recharge_status = 'PROCESSING' and rownum <=10 union all " + 
                        " select  * from recharge_records where recharge_type = 'ALIPAY' and recharge_status = 'NEW' and rownum <=10 union all " + 
                        " select  * from recharge_records where recharge_type = 'MANAUL' and recharge_status = 'SUCCESS' and rownum <=10 union all " + 
                        " select  * from recharge_records where recharge_type = 'OFFFLINE' and recharge_status = 'FAILURE' and rownum <=10 union all " + 
                        " select  * from recharge_records where recharge_type = 'CMS' and recharge_status = 'PROCESSING' and rownum <=10 union all " + 
                        " select  * from recharge_records where recharge_type = 'WITHHOLD' and recharge_status = 'FAILURE' and rownum <=10 union all " + 
                        " select  * from recharge_records where recharge_type = 'ALIPAY' and recharge_status = 'SUCCESS' and rownum <=10 union all " + 
                        " select  * from recharge_records where recharge_type = 'COMPENSATE' and recharge_status = 'SUCCESS' and rownum <=10 union all " + 
                        " select  * from recharge_records where recharge_type = 'AUTO' and recharge_status = 'PROCESSING'  and rownum <=10";
        sql = "select * from  cms_capital_statements where status = 'WAITING' and statement_Type = 'RECHARGE' and manual_Verified = 0 and rownum <= 10";
        PreparedStatement pstat = conn.prepareStatement(sql);
        ResultSet rset = pstat.executeQuery();
        printClass(rset);
        printIbatisFile(rset);
        List<String> metaDataName = getMetaDate(rset);
        int i = 1;
        while(rset.next()) {
            List<String> valueList = getValue(rset, metaDataName, i);
            String result = "insert into %s (%s) \n values (%s);";
            System.out.println(String.format(result, "recharge_records", metaDataName, valueList).replaceAll("\\(\\[", "\\(").replaceAll("\\]\\)", "\\)"));
            i++;
        }
        
    }
    
    public static void printClass(ResultSet rset) throws SQLException{
        ResultSetMetaData metaData = rset.getMetaData();
        Integer size = metaData.getColumnCount();
        for(int i =1 ;i <= size ; i++) {
            String columnName = metaData.getColumnName(i);
            Integer type = metaData.getColumnType(i);
            switch(type) {
            case Types.TIME:
            case Types.DATE:
                System.out.println("private Date " + format(columnName) + ";");
                break;
            case Types.NUMERIC:
                if(columnName.contains("_ID") || "id".equalsIgnoreCase(columnName)) {
                    System.out.println("private Long " + format(columnName)+ ";");
                } else {
                    System.out.println("private BigDecimal " + format(columnName)+ ";");
                }
                break;
            default :
                System.out.println("private String " + format(columnName)+ ";");
                break;
            }
        }
    }
    
    
    public static void printIbatisFile(ResultSet rset) throws SQLException{
//        <result property="frozenAmount" column="FROZEN_AMOUNT" />
        String template = "<result property=\"%s\" column=\"%s\" />";
        ResultSetMetaData metaData = rset.getMetaData();
        Integer size = metaData.getColumnCount();
        for(int i =1 ;i <= size ; i++) {
            String columnName = metaData.getColumnName(i);
//            Integer type = metaData.getColumnType(i);
            System.out.println(String.format(template, format(columnName), columnName));
            
        }
    }
    
    public static void printTestClass(ResultSet rset) throws SQLException{
        
      ResultSetMetaData metaData = rset.getMetaData();
      Integer size = metaData.getColumnCount();
      for(int i =1 ;i <= size ; i++) {
          String columnName = metaData.getColumnName(i);
          Map result = new HashMap();
          result.put(format(columnName), rset.getObject(columnName));
      }
  }
    
    private static String format(String columnName) {
        String[] temp = columnName.toLowerCase().split("_");
        String result = temp[0];
        for(int i = 1; i < temp.length; i++) {
            result += temp[i].toUpperCase().substring(0, 1) + temp[i].toLowerCase().substring(1);
        }
        return result;
    }
    
    public static List<String> getMetaDate(ResultSet rset) throws SQLException {
        List<String> result = new ArrayList<String>();
        ResultSetMetaData metaData = rset.getMetaData();
        Integer size = metaData.getColumnCount();
        for(int i =1 ;i <= size ; i++) {
            String columnName = metaData.getColumnName(i);
            if(!"ADDCOLUMN_TEST".equalsIgnoreCase(columnName)) {
                result.add(columnName);
            }
        }
        return result;
    }
    
    public static List<String> getValue(ResultSet rset, List<String> metaDataName, int i) throws SQLException {
        List<String> result = new ArrayList<String>();
        for(String columnName : metaDataName) {
            if("id".equalsIgnoreCase(columnName)) {
                result.add(i + "");
            } else {
                Object value = rset.getObject(columnName);
                result.add(format(value));
            }
        }
        return result;
    }
    
    public static String format(Object o) throws SQLException {
        if(o == null) {
            return "null";
        }
//        System.out.println(o.getClass());
        if(o instanceof TIMESTAMP) {
            TIMESTAMP a = (TIMESTAMP)o;
            
            return String.format("to_date('%s','yyyy-mm-dd hh24:mi:ss')",new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(a.dateValue()));
        }
        return "'" + o.toString() + "'";
    }
    
}
