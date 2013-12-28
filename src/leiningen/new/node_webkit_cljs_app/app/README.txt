Node-Webkit
-----------

Node-Webkit 0.8.3 is provided. If you'd like to view the Github repo for Node-Webkit please go to the following link:

https://github.com/rogerwang/node-webkit

Open up a command prompt to your project directory and compile the provided ClojureScript using the following command. Note, you must change the directory so that you are inside the project folder that is a child directory of the folder that contains the Node-Webkit runtime files.

lein cljsbuild once dev

Once the source finishes compiling change the directory to go back up a level to the main folder containing the Node-Webkit runtime files and run the following command:

nw <your app name>

Your new application should load up in Node-Webkit.

Clojurescript
-------------

There are two build configurations 'dev' and 'prod'. You can start the compiler
using the following command which will automatically build your Clojurescript
and watch your files and recompile as needed.

To build and watch your ClojureScript files indefinitely:

lein cljsbuild auto dev

To build your ClojureScript files once:

lein cljsbuild once dev

Note: Substitute 'dev' for 'prod' or edit the build configuration in the project.clj file. For instructions on how to modify the CLJS build options look at the following Github repo:

https://github.com/emezeske/lein-cljsbuild

--

Frank Hale <frankhale@gmail.com>
