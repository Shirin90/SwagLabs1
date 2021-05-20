  How to pull Project from Github to eclipse
  -------------------------------------------

Go to Eclipse Upper Left Corner, Click on File then you're able to see a dropdown, 
click on Import, and a new window will appear.
Then click on Git folder when extended you will be able to see (Project from git) 
and Select it Then Click on next, again another window will appear and select clone URL
displayed URL Window Enter the flowing URL 
(https://github.com/Shirin90/SwagLabs1.git) And hit next, 
select next again and then finish. 
When installing is finished, you have to do maven life cycle 
a. Maven Clean 
b. Maven Install
c. Maven Update 
When maven update is completed then under project, you're able to see Sanity.xml file, 
right click on xml file and run as a TestNG then it will run.
When it is done, you're able to see under project, extend report folder under the folder
there is another file named (ExtentReportResults.html)
Right click on this file and open with web browser and you will be able to see report and if test cases
fail you will be able to see with screen shot report.

Requirements to Run Project.
---------------------------

Java, Maven, TestNG, Log 4J, Extend Report Automation Starter
This is a simple project that would allow anyone to get up and running with Java, Maven, Selenium and TestNG. 
It also explains how to execute a simple test that will assert the title of a page.
Currently the project has one test that will navigate to (https://www.saucedemo.com/) and 
verify the title matches Virtual Facility

Before pull-up project from Git-Hub, we will need to be install some prerequisite tools in our local machine.
-------------------------------------------------------------------------------------------------------------
 Step 1: Download JDK
 Goto Java SE download site @ http://www.oracle.com/technetwork/java/javase/downloads/index.html.
 Under "Java Platform, Standard Edition" ⇒ "Java SE 1.8.{x}", where {x} denotes a fast running security-update number ⇒ Click the        "Oracle JDK" "Download" button.
 Under "Java SE Development Kit 1.8.{x}" ⇒ Check "Accept License Agreement".
 Choose the JDK for your operating system, i.e., "Windows". Download the "exe" installer (e.g., "jdk-1.8.{x}_windows-x64_bin.exe" -      about 150MB).
 
 Step 2: Include JDK's "bin" Directory in the PATH
 Windows' Command Prompt (CMD) searches the current directory and the directories listed in the PATH environment variable (or system      variable) for executable programs. JDK's programs (such as Java compiler "javac.exe" and Java runtime "java.exe") reside in the          sub-directory "bin" of the JDK installed directory. You need to include JDK's "bin" in the PATH to run the JDK programs.
 To edit the PATH environment variable in Windows 10:
 Launch "Control Panel" ⇒ (Optional) "System and Security" ⇒ "System" ⇒ Click "Advanced system settings" on the left pane.
 Switch to "Advanced" tab ⇒ Click "Environment Variables" button.
 Under "System Variables" (the bottom pane), scroll down to select variable "Path" ⇒ Click "Edit...".
 
 Step 3: Verify the JDK Installation
 Launch a CMD via one of the following means:
 Click "Search" button ⇒ Enter "cmd" ⇒ Choose "Command Prompt", or
 Right-click "Start" button ⇒ run... ⇒ enter "cmd", or
 Click "Start" button ⇒ Windows System ⇒ Command Prompt
 
 // Display the JDK version
 javac -version
 javac 1.8.1

 // Display the JRE version
 java -version
 java version "1.8.0" 2018-10-16 LTS
 Java(TM) SE Runtime Environment 18.9
 Java HotSpot(TM) 64-Bit Server VM 18.9, mixed mode).

 To install Apache Maven on Windows, 
 you just need to download the Maven’s zip file, unzip it to a folder, and configure the Windows      environment variables.
 Tested with :
 JDK 1.8
 Maven 3.6
 Windows 10
 Note
 Maven 3.3+ requires JDK 1.7+
 #. JDK and JAVA_HOME
 Make sure JDK is installed, and JAVA_HOME environment variable is configured.
 Check your system to see if you have the 1.8 Java version installed.
 From CMD Command:
 $ java -version
 If you do not have the latest Java installed, find out how to install Java.

 #. Download the Eclipse Installer
 Download Eclipse Installer from http://www.eclipse.org/downloads.
 
 Start the Eclipse Installer executable
 For Windows users, after the Eclipse Installer executable has finished downloading it should be available in your download              directory. Start the Eclipse Installer executable. You may get a security warning to run this file. If the Eclipse Foundation is        the Publisher, you are good to select Run.
 
 Select the package to install
 The new Eclipse Installer shows the packages available to Eclipse users. You can search for the package you want to install or          scroll through the list.
 Select and click on the package you want to install.
 
 Select your installation folder
 Specify the folder where you want Eclipse to be installed. The default folder will be in your User directory.
 
 Launch Eclipse
 Once the installation is complete you can now launch Eclipse. The Eclipse Installer has done it's work. Happy coding.
 Setting up Eclipse
 Navigate to the Eclipse download page and download eclipse for Java EE developers.
 Installing TestNG
 Installing a Plugin:
 Inside Eclipse, click on the Help menu
 Select Install New Software.
 Install New Software-1
 Locating the Plugin:
 Click the Add button
 Enter http://beust.com/eclipse in the Location field
 Install New Software-2
 Selecting the Plugin:
 Ensure the TestNG checkbox is selected
 Click the "Next" button to the right bottom
 Install New Software
 Finishing up:
 Accept the terms of the license agreement
 Click on the Finish button.
