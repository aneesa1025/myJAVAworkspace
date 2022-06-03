package com.filesection;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class FinanceWriter {
	public void write(Stock[] stocks) {
		Writer writer = null;
		try {
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/tmp/filename.csv")));
			writer.write("id, stockname, quantity");
			writer.write("\n");
			for (Stock st : stocks) {
				writer.write(st.getId() +"," + st.getStockname() + "," + st.getQuantity());
				writer.write("\n");
			}
		}   catch (IOException ex) {
			ex.printStackTrace();
			//report
		}finally {
			try {
				
				writer.close();
			} catch(Exception ex) {
				/* ignore */}
		}
		}
}

