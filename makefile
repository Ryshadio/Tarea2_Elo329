JFLAGS = -g
JC = javac
JVM = java
FILE =
JavaFX=

.SUFFIXES: .java .class

.java.class:
	$(JC) --module-path $(JavaFX) --add-modules javafx.controls,javafx.fxml,javafx.media  $.java

CLASSES = Stage4.java

MAIN = Stage4


default: classes

classes: $(CLASSES:.java=.class)

run: $(MAIN).class
	$(JVM) --module-path $(JavaFX) --add-modules javafx.controls,javafx.fxml,javafx.media  $(MAIN)

clean:
	rm -rf.class CLASES/*.class
