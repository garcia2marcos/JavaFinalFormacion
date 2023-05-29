package indra.talent.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException {
		
		System.out.println("Bienvenidos a reflection");
		
		try (Scanner in = new Scanner(System.in)){
			Class<?> clazz = null;
			
			boolean claseEncontrada = false;
			while(!claseEncontrada) {
				System.out.println("Ingrese el nombre completo");
				String className = in.nextLine();
				
				try {
					clazz = Class.forName(className);
					claseEncontrada= true;
				}catch(Exception ex) {
					System.out.println("Clase no encontrada");
				}
				
				System.out.println("Los atributos de la clase son: ");
				Field[] fields = clazz.getDeclaredFields();
				 for (Field field : fields) {
					 System.out.format("%s %s", 
							 Modifier.toString(field.getModifiers()),
							 field.getName(),
							 field.getType().getName());
					 System.out.println("");
					 
				 }
				 
				 System.out.println("los metodos son");
				 List<Method> metodos =Arrays.asList(clazz.getDeclaredMethods());
				 metodos = metodos.stream().
						 filter(m->!m.getName().startsWith("set") && !m.getName().startsWith("get")).
						 toList();
				 
				 for(Method method : metodos) {
					 System.out.format("   %s  %s : %s",
							 Modifier.toString(method.getModifiers()),
							 method.getName(),
							 method.getReturnType().getName());
					 System.out.println();
				 }
				 
				 System.out.println("Instanciando un objeto de ese tipo");
				 Object objeto = clazz.getConstructors()[0].newInstance();
				 System.out.println("Objetos instanciados");
				 
				 System.out.println("Desea modificar algun atributo");
				 String modificarAtributo=in.nextLine();
				 while(modificarAtributo.equalsIgnoreCase("S")){
					 
					 
					 boolean atributoEncontrado =false;
					 while(!atributoEncontrado) {
						 
					 System.out.println("Que atributo desea modificar");
					 String atributo = in.nextLine();
					 try {
						 Field f = clazz.getDeclaredField(atributo);
						 System.out.println("Que valor desea ponerle");
						 String valor = in.nextLine();
						 f.set(objeto, valor);
						 f.setAccessible(true);
						 atributoEncontrado= true;
						 
					 }catch(Exception ex) {
						 System.out.println("Atributo no encontrado");
					 	}
					 
					 
					 }
					 
					 System.out.println("Desea modificar otro atributo?");
					 modificarAtributo = in.nextLine();
					 
				 }
				 
				 System.out.println("Los atributos quedan asi: ");
				 for(Field field : fields) {
					 field.setAccessible(true);
					 System.out.format("    %s   %s",
							 field.getName(),
							 field.get(objeto));
					 System.out.println();
				 }
				System.out.println("Desea invocar un metodo");
				String modificarMetodo = in.nextLine();
				while (modificarMetodo.equalsIgnoreCase("S")) {
					
					boolean metodoEncontrado=false;
					while(!metodoEncontrado) {
						System.out.println("Que metodo? (Ojo sin parametros)");
						String nombreMetodo = in.nextLine();
						try {
							Method metodo = clazz.getDeclaredMethod(nombreMetodo);
							metodo.invoke(objeto);
							metodoEncontrado = true;
						}catch(Exception ex) {
							System.out.println("Metodo no encontrado");
						}
						
					}
					System.out.println("Desea invocar otro metodo");
					modificarMetodo= in.nextLine();
				}
			}
			
		}
		

	}
//indra.talent.reflection.models.SuperHeroe
}
