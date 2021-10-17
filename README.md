Importing this project into Eclipse 2021-09 with buildship 3.1.5.v20210113-0929 yields the following error:

    Java Model Exception: Java Model Status [Test source folder 'xtestx' in project 'buildship-test' must have an output folder that is not also used for main sources]
    
When you change the java source directory to something without the string 'test' in its path, everything works fine.
