BEST
====

**      **  **    **  **      **
****   ***   **  **   ****   ***
** ** ****    ****    ** ** ****
**  **  **     **     **  **  **
**      **     **     **      **
**      **     **     **      **


Batch Extended Supervision Tool

In order to give users a Spring Batch Graphic Tool, we've developped this tool, using, BootStrap, Angular, SpringBatch, and AmChart.

1 - there are two principal parts : 
	The first module, consists into a batch Test Import From CSV to MYSQL:
	a) You've to install the mySql server on your machine.
	b) import the project.
	c) if you've a maven dependencies problem, that must be because of network configuration, to correct this you've to:
		- add setting.xml file in the project file folder with the pom.xml.
		- add these lines into your setting.xml file
		<proxies>
			<proxy>
			  <port>your proxy port</port>
			  <host>your proxy adress</host>
			</proxy>
		</proxies>
	d) now you can run your first batch and see your tables content especially the personnal(raw_report), spring batch(jobContext, the jobInstance, and the StepExecution status and exit codes).

The webApp module is under development.