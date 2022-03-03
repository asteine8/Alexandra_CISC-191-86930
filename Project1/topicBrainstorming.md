# Ideas

- Image processing program
  - Loads image files and applies a number of processing techniques onto them
    - Blurs
    - Sharpening
    - Color Rebalancing
    - Grayscale
    - Image conversion
    - etc...
  - See BufferedImage and ImageIO Java utility classes
- Command Line utility calculator
  - Accepts strings in format "[expression] = ?" or "[expression] = [expression]"
  - Returns strings in format "[expression] = value" or "[expression] = [expression] is true/false"
  - Takes input from command line argument or text file input
    - If calculating from a text file, multiple expressions will be calculated when separated by newlines
  - Command line specification
    - evaluate [<options>…​] <path_to_file)>|<string_input>
      - Tries to evaluate the last argument as the expression by default
    - options:
      - [f] Retrieve expression(s) from the file-path
      - [w|write] the output is written to the file if a file path is provided
      - [h|help] displays the help message
      - 
    - If no path or string input is provided, show a help message
- 