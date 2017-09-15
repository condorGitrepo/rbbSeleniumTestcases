# Makefile
 
# PHONY := target is not associated with a physical file 
## (z.B.: the target "clean" is independent from the "file clean", if it exists)
.PHONY: all start clean
  
# Define Variables
JAVA=java
JAVAC=javac
JAVAOPTS=-cp :./lib/.*:./jar_sel_standalone_server/selenium-server-standalone-3.5.3.jar:./openqa/client-combined-3.5.3-nodeps.jar:.

MAINNAME=rbbSel

#YMLTAG = role.ctags
#CTAGS_HOME = /home/mge/.vim/ctags/
#PROJECT = /home/mge/sf_doc/merged/git/ansible_Stick_ist_aktueller/roles/rbb.app.jenkins-gearman


# --- Makefile Logic ---
   
all:
	${JAVAC} ${JAVAOPTS} ${MAINNAME}.java
	## javac -cp :./lib/.*:./jar_sel_standalone_server/selenium-server-standalone-3.5.3.jar:./openqa/client-combined-3.5.3-nodeps.jar:. GoogleHelloWorld.java

start:
	${JAVA} ${JAVAOPTS} ${MAINNAME}
	## * java -cp :./lib/.*:./jar_sel_standalone_server/selenium-server-standalone-3.5.3.jar:./openqa/client-combined-3.5.3-nodeps.jar:. GoogleHelloWorld

clean:
	rm -f *.class

# ----------------------



#ctags: 
#rm -f ${CTAGS_HOME}${YMLTAG}
#ctags -R -f ${CTAGS_HOME}${YMLTAG} --sort=1 ${PROJECT}
#ctags -R --sort=1 --language=none --regex='^[ \t]*-[ \t]*name:[\t]*\(.*?\)[ \t]*$' ~/sf_doc/merged/git/ansible_Stick_ist_aktueller/roles/rbb.app.jenkins-gearman/*.yml
# ctags -R --language=none --regex='^[ \t]*-[ \t]*name:[ \t]*\(.*?\)[ \t]*$' ~/sf*.yml
# roles/*/tasks/*.yml roles/*/handlers/*.yml
#     # MAX-ctags: #ctags -R --sort=1 --c++-kinds=+p --fields=+iaS --extra=+q --language-force=C++ -f bm3d_tags 

#readLog: $(OBJ)
#$(CC) $(OFLAGS) -o $@ $(OBJ) $(LDFLAGS)
#$(CC) $(OFLAGS) -o $@ $(OBJ) $(LDFLAGS)
#$(MEX) $(LFLAGS) -cxx -o $@ $(OBJWiener)
#%.o: %.cpp
#$(CC) $(CFLAGS) -c $< 
#$(MEX) $(CFLAGS) -c $<
