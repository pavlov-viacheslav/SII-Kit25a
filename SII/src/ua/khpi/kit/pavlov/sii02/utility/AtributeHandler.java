/**
 * @file AtributeHandler.java
 *
 * @author JR_Rider
 * @date 22 но€б. 2017 г.
 */
package ua.khpi.kit.pavlov.sii02.utility;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author JR_Rider
 *
 */
public class AtributeHandler {

	final private ArrayList<String> validTypes = (ArrayList<String>) Arrays.asList("Integer", "Double", "Long");
	ArrayList<Atributes> objectList;

	public AtributeHandler(ArrayList<Atributes> objectList) {
		this.objectList = objectList;
	}

	public void loadObject(String name) {
		objectList.add(new Atributes(name));
	}

	public int[] getAsIntegerArray(String atributeName) {
		int[] res = {};
		if (!Atributes.atributeTypes.containsKey(atributeName))
			return null;
		if (validTypes.contains(Atributes.atributeTypes.get(atributeName)))
			for (Atributes a : objectList) {
				if (a.getAtributes().containsKey(atributeName))
					res[res.length] = Integer.parseInt(a.getAtributes().get(atributeName));
			}

		return res;
	}

}
