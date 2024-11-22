


# automatic variables
# https://www.gnu.org/software/make/manual/html_node/Automatic-Variables.html
# $@ target
# $< first prereq
# $^ all prereqs



demo_java := $(wildcard unit*/*.java)
demo_md = $(patsubst %.java, %.md, $(demo_java))

all: $(demo_md) html 
	@echo $(demo_md)

html:
	jb build .

view:
	open _build/html/index.html

deploy:
	rm -r ../docs
	cp -r _build/html ../docs
	touch ../docs/.nojekyll

pdf:
	jb build . --builder pdflatex

viewpdf:
	open _build/latex/book.pdf


%.md : %.java
	echo "# $(notdir $<)" >> $@
	echo "\`\`\`java" >> $@
	cat $< >> $@
	echo "\`\`\`" >> $@


clean:
	jb clean .
	rm $(demo_md)

