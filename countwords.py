with open('Metodologia Ágil/README.md, 'r') as file:
    texto = file.read()
    count = len(texto.split())
    print(f"O arquivo 'Modelo Ágil/README.md' contém {count} palavras")

with open('dist/output.txt', 'w') as file:
    file.write(f"O arquivo 'Modelo Ágil/README.md' contém {count} palavras.")