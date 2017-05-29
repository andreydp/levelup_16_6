package ua.dp.levelup.reflection;

import java.lang.reflect.Field;

/**
 * Created by andrey on 07.03.17.
 */
public class XMLParser {

    public String toXml(Object obj) {
        StringBuilder builder = new StringBuilder();

        Class clazz = obj.getClass();

        builder.append(String.format("<%s", clazz.getSimpleName()));
        builder.append(System.lineSeparator());

        Field[] fields = clazz.getDeclaredFields();
        try {
            for (Field field : fields) {
                if (field.isAnnotationPresent(ToXML.class)) {
                    String fieldName = field.getName();
                    if (!field.isAccessible()) field.setAccessible(true);
                    builder.append(String.format("\t<%s>", fieldName));
                    builder.append(field.get(obj));
                    builder.append(String.format("</%s>", fieldName));
                    builder.append(System.lineSeparator());
                }
            }

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        builder.append(String.format("</%s>", clazz.getSimpleName()));
        return builder.toString();
    }

    public Object parseXML(String xml, Class clazz) {
        try {
            Object obj = clazz.newInstance();

            String[] lines = xml.split(System.lineSeparator());

            for (String line : lines) {
                if (line.trim().equals(String.format("<%s>", clazz.getSimpleName())) || line.trim().equals(String.format("</%s>", clazz.getSimpleName()))) {
                    int startIndex = line.indexOf("<") + 1;
                    int endIndex = line.indexOf(">");
                    String fieldName = line.substring(startIndex, endIndex);

                    Field field = clazz.getDeclaredField(fieldName);


                }
            }

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        return null;
    }
}
