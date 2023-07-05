package Evidence;

import java.io.FileInputStream;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;


public class Evidence {

		String filename;
		String imagename;
		
		public void createEvidence() {
			try {
				
				PDDocument doc = new PDDocument();
				PDPage page = new PDPage();
				
				doc.addPage(page);
				
				PDXObjectImage image = new PDJpeg(doc, new FileInputStream(imagename));
				
			} catch(Exception e) {
				
			}
			
		}
}
