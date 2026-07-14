while True:
    escolha = input(print("Caso errado ou corrigido? (e | c | anyone = break)")).strip().lower()
    if(escolha == "e"):
    #exemplo sem a existência do caso base (loop infinito)
        def regressiva(i):
            print(i)
            regressiva(i - 1)
        regressiva(10)
    
    elif escolha == "c":
    #exemplo corrigido com caso base e caso recursivo
        def regressiva(i):
            print(i)
            if(i <= 1): #caso base
                return
            else:
                regressiva(i - 1) #caso recursivo
        regressiva(10)
    else:
        break