# node-webkit-cljs-app

A Leiningen template for Node-Webkit Clojurescript apps.

NOTE: Currently this template assumes Windows and it provides the binary files for Node-Webkit runtime version 0.9.2.

# Usage

NOTE: This has not been uploaded to clojars yet so for the time being simply
download and then use lein install to install it. After installation it'll work
just like if it was installed via Clojars.

You can clone the directory or either download it as a zip. 

Once you have the template, change into the top directory and run the following
command from the command line:

```
lein install
```

After installation you can create a new project using the following command:

```
lein new node-webkit-cljs-app [app-name-here]
```

Change the directory to your new project and follow the instructions below in order to compile the ClojureScript so your application can be ran.

You can start the compiler using the following command which will automatically build your Clojurescript and watch your files and recompile as needed.

```
lein cljsbuild auto dev
```

If you prefer to leave cljsbuild running you can open up another command prompt to your application directory and run your new app with the following command:

```
nw <your app name>
```

Your new application should load up in Node-Webkit.

## License

Copyright © 2014 Frank Hale

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.