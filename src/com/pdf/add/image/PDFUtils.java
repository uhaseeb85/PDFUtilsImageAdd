/**
 * 
 */
package com.pdf.add.image;

import java.net.URL;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;

/**
 * @author HaseebUsman_Ali
 *
 */
public class PDFUtils {
	
	/**
	 * Adds the image.
	 *
	 * @param document  the document
	 * @param tableData the table data
	 * @throws Exception the exception
	 */
	public static void addImage(Document document, float xAxisPosition, float yAxisPosition, int scaleXaxis, int scaleYaxis) {
		try {
			document.add(Chunk.NEWLINE);
			document.add(Chunk.NEWLINE);
			
			ClassLoader classLoader = PDFUtils.class.getClassLoader();
			URL resource = classLoader.getResource("resources/LRQA_Logo.jpg");
			// Add Image
			Image image1 = Image.getInstance(resource);
			// Fixed Positioning
			//image1.setAbsolutePosition(50f, 690f);
			image1.setAbsolutePosition(xAxisPosition, yAxisPosition);
			// Scale to new height and new width of image
			image1.scaleAbsolute(scaleXaxis, scaleYaxis);
			// Add to document
			document.add(image1);
		} catch (Exception e) {
			System.out.println("Adding Image Failed. :: " + e.getMessage());
		}

	}

}
