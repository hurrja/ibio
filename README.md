# IBIO input-output helpers
## Simplified I/O in Java programs
   This repository contains a set of static input-output helper
   methods written by the IBO. The copyright holder of the original
   code is IBO. Here the code has been packaged conveniently, and
   instructions have been provided for easy use.

## Usage
   1. Clone this repository into your project directory by running
      ```
      git clone https://github.com/jarmohurri/ibio.git
      ```
      or, if you are using `git` yourself in your project, add this library as a submodule
      ```
      git submodule add https://github.com/jarmohurri/ibio.git
      ```
   2. If you want to use helper functions in a `.java`-file, add the following line into the file:
      ```
      import static ibio.Helpers.*;
      ```
   3. Now the helpers are available to you without a class prefix. For example, you can directly call
      ```
      output (156);
      ```
## Disclaimer
   THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL
   WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED
   WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE
   AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT, INDIRECT, OR
   CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS
   OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT,
   NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN
   CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
