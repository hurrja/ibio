# IBIO input-output helpers
## Simplified I/O in Java programs
   This repository contains a set of static input-output helper
   methods written by the IBO. The copyright holder of the original
   code is IBO. Here the code has been packaged conveniently, and
   instructions have been provided for easy use.

## Installation
### If you are using Intellij IDEA
    1. Create new project from version control.
    2. As project source, give https://github.com/jarmohurri/ibio.git
    3. Install git if asked to do that.
    4. After git has cloned the project, you can close the project.
    After this, to use this package in a project:
    1. Select File -> Project structure....
    2. Select Modules.
    3. Select Dependencies.
    4. Select + -> JARs or directories...
    5. This opens a file selector. Locate ibio.jar and select it.
    6. Select OK.
### If you are using git as your own version control system
####  Add this library as a submodule of your project
       
      git submodule add https://github.com/jarmohurri/ibio.git
       
## Usage in Java
   1. Add the following line into your Java file:
      ```   
      import static ibio.Helpers.*;
      ```
   2. Now the helpers are available to you without a class prefix. For example, you can directly call
      ```   
      output (156);
      
## Disclaimer
   THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL
   WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED
   WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE
   AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT, INDIRECT, OR
   CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS
   OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT,
   NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN
   CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
