package eu.ddmore.libpharmml.so.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import eu.ddmore.libpharmml.impl.PharmMLVersion;
import eu.ddmore.libpharmml.impl.XMLFilter;

public class SOXMLFilter extends XMLFilter {
	
	protected PharmMLVersion pharmml_version;
	protected SOVersion so_version;
	
	public SOXMLFilter(SOVersion writtenVersion){
		super(writtenVersion.getCorrespondingPharmMLVersion());
		this.pharmml_version = writtenVersion.getCorrespondingPharmMLVersion();
		this.so_version = writtenVersion;
	}
	
	void filterPharmMLUris(InputStream is, OutputStream os) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(is));
    	String line = null;
    	OutputStreamWriter osw = new OutputStreamWriter(os);
    	while((line = br.readLine()) != null){
    		line = line.replaceAll("xmlns(:\\w+)?=\"http://www.pharmml.org/[^\"(so)]+/([^\"]+)\"",
    				"xmlns$1=\"http://www.pharmml.org/pharmml/"+ pharmml_version.toString() +"/$2\"");
    		osw.append(line);
    		osw.append("\n");
    	}
    	br.close();
    	osw.close();
    }
}
