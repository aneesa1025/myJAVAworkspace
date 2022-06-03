package com.mkyong.app;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.mkyong.stock.Stock;
import com.mkyong.stock.StockDailyRecord;
import com.mkyong.util.Hibernateutil;

public class App {
	public static void main(String[] args) {
		//saveStock();
		updateStock();
		getallStocks();
		
		
			
	}



	private static void saveStock() {
		System.out.println("Hibernate one to many (Annotation)");
		Session session = Hibernateutil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Stock stock = new Stock();
		stock.setStockCode("7052");
		stock.setStockName("ANISHA");
		session.save(stock);
		
		StockDailyRecord stockDailyRecords = new StockDailyRecord();
		stockDailyRecords.setPriceOpen(new Float ("1.2"));
		stockDailyRecords.setPriceClose(new Float ("1.1"));
		stockDailyRecords.setPriceChange(new Float("10.0"));
		stockDailyRecords.setVolume(3000000L);
		stockDailyRecords.setDate(new Date());
		
		stockDailyRecords.setStock(stock);
		stock.getStockDailyRecords().add(stockDailyRecords);
		
		session.save(stockDailyRecords);
		
		session.getTransaction().commit();
		System.out.println("Done");
	}


 
public static void getallStocks() {
	Session session = Hibernateutil.getSessionFactory().openSession();
	
	Transaction tx = null;
	
	try {
		tx = (Transaction) session.beginTransaction();
      List stock = (List) session.createQuery("From Stock").list();
		for (Iterator iterator = stock.iterator();iterator.hasNext();){
			Stock stock1= (Stock) iterator.next();
			 
	            System.out.print("Stock Name: " + stock1.getStockName());
	            System.out.print(" Stock Code: " + stock1.getStockCode());
	            
		}
		tx.commit();
    } catch (Exception e) {
       if (tx!=null)
	
			tx.rollback();
       
       e.printStackTrace(); 
    } finally {
       session.close(); 
    }
 }
 

/* Method to UPDATE code for Stock */
public static  void updateStock(){
	Session session = Hibernateutil.getSessionFactory().openSession();
	
   Transaction tx = null;
   
   try {
      tx = session.beginTransaction();
      Stock st = session.get(Stock.class, 1); 
      //String StockCode = st.getStockCode();
      //String StockName = st.getStockName();
      st.setStockCode("100-oo1");
      st.setStockName("PP123");
		 session.update(st);
		 
		
		 
      tx.commit();
   } catch (Exception e) {
       if (tx!=null)
	
			tx.rollback();
       
       e.printStackTrace(); 
    } finally {
       session.close();
    }
    }
   
   
   public void getrecordfromnativesql( ){ 
	   Session session = Hibernateutil.getSessionFactory().openSession();
	      Transaction tx = null; 
	      try{ 
	         tx = session.beginTransaction(); 
	         String sql = "SELECT STOCK_CODE,STOCK_NAME FROM STOCK"; 
	         SQLQuery query = session.createSQLQuery(sql); 
	         query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP); 
	         List<Stock> data = query.list();  
	         for (Stock stock:data) {
	        	 String code=stock.getStockCode();
	        	  String name =stock.getStockName();
	        	 System.out.println("STOCK_CODE:" + code);
	        	 System.out.println("STOCK_NAME:" + name);
	        	 
	        	 
	        	 
	         }
	         tx.commit();
	      }
	      catch (Exception e) {
	          if (tx!=null)
	   	
	   			tx.rollback();
	          
	          e.printStackTrace(); 
	       } finally {
	          session.close();
	       }
   }
	      
	      
	      public void insertrecordusingbatch( ){ 
	   	   Session session = Hibernateutil.getSessionFactory().openSession();
	   	      Transaction tx = null;
	   	   try {
	           tx = session.beginTransaction();
	           for ( int i=0; i<100000; i++ ) {
	              String fname = "First Name " + i;
	              String lname = "Last Name " + i;
	              Integer salary = i;
	              Stock stock = new Stock(name,codec);
	              session.save();
	           	if( i % 50 == 0 ) {
	                 session.flush();
	                 session.clear();
	              }
	           }
	           tx.commit();
	        } catch (HibernateException e) {
	           if (tx!=null) tx.rollback();
	           e.printStackTrace(); 
	        } finally {
	           session.close(); 
	        }
	        return ;
	     }
	       }
   }



