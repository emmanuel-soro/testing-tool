package ar.edu.tool;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Optional;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;

public class Main {

	public static void main(final String[] args) {

		try {

			CompilationUnit compilationUnit =
			        StaticJavaParser.parse(new File("src/main/java/ar/edu/tool/Test.java"));

			Optional<ClassOrInterfaceDeclaration> classTest =
			        compilationUnit.getClassByName("Test");

			ClassOrInterfaceDeclaration c = classTest.orElse(new ClassOrInterfaceDeclaration());

			for (MethodDeclaration method : c.getMethods()) {

				System.out.println(method.getBody().get().toString());

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 
	 */
	public static void checker() {

		try {
			Class cls = Class.forName("ar.edu.tool.Test");

			int methodsCount = cls.getDeclaredMethods().length;

			System.out.println("El número de metodos es " + methodsCount);
			System.out.println();

			for (Method m : cls.getDeclaredMethods()) {
				System.out.println(m);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void counter() {

	}

}
