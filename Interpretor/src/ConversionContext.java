import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ConversionContext {

	String inputQuantity;
	String inputType;
	String outputQuantity;
	String outputType;

	public ConversionContext(String input) {
		String[] inputs = input.split(" ");
		inputQuantity = inputs[0];
		inputType = inputs[1];
		outputType = inputs[3];
		polishInputs();
	}

	private void polishInputs() {
		// Input type
		inputType = inputType.toLowerCase();
		inputType = Character.toUpperCase(inputType.charAt(0)) + inputType.substring(1);
		if (!"s".equalsIgnoreCase(inputType.substring(inputType.length() - 1))) {
			inputType = inputType.concat("s");
		}

		// Output type
		outputType = outputType.toLowerCase();
		if (!"s".equalsIgnoreCase(outputType.substring(outputType.length() - 1))) {
			outputType = outputType.concat("s");
		}
	}

	public String getConvertedOutput() {
		StringBuffer outputString = new StringBuffer(inputQuantity +"  "+ inputType + "   equals   ");
		try {
			Class converter = Class.forName(inputType);
			Constructor constructor = converter.getConstructor();
			Object converterObject = constructor.newInstance();
			Class[] methodParams = new Class[] { Double.class };
			Object[] objectParams = new Object[] { new Double(inputQuantity) };
			Method methodToCall = converter.getMethod(outputType, methodParams);
			outputQuantity = (String) methodToCall.invoke(converterObject, objectParams);
		} catch (Exception e) {
			e.printStackTrace();
		}
		outputString = new StringBuffer(outputString.toString().concat(outputQuantity).concat(outputType));
		System.out.println(outputString);
		return outputString.toString();
	}
}
