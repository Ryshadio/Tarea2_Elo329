JFLAGS = -g
JC = javac
JVM = java
FILE =
JavaFX= 

.SUFFIXES: .java .class

.java.class:
	$(JC) --module-path $(JavaFX) --add-modules javafx.controls,javafx.fxml,javafx.media Stage2.java

CLASSES = Stage2.java

MAIN = Stage2


default: classes

classes: $(CLASSES:.java=.class)

run: $(MAIN).class
	$(JVM) --module-path $(JavaFX) --add-modules javafx.controls,javafx.fxml,javafx.media  $(MAIN)

clean:
	rm -rf.class CLASES/*.class
