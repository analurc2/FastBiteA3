# 🍔 FastBite — Fluxograma Geral do Sistema

```mermaid
flowchart TD
    A([🚀 Iniciar\nFastBite.java]) --> B[Exibir Banner e\nCores do Sistema\nCores.java]
    B --> C[/Menu de Entrada\nMenuapp.java/]

    C --> D{O que deseja?}
    D -->|Cadastrar| E[Criar novo usuário]
    D -->|Entrar| F[Login com\nusuário e senha]
    D -->|Sair| Z([❌ Encerrar])

    E --> E1{Cadastro\nOK?}
    E1 -->|Não| C
    E1 -->|Sim| F

    F --> F1{Login\nválido?}
    F1 -->|Não| C
    F1 -->|Sim| G

    G[/Menu Principal\nMenuapp.java/]
    G --> H{Escolha uma opção}

    H -->|Ver Restaurantes| I[/Restaurantes.java/]
    H -->|Ver Carrinho| M[/Carrinho.java/]
    H -->|Meu Perfil| O[/Perfil.java/]
    H -->|Histórico| N[/Historico.java/]
    H -->|Sair| Z

    I --> I1{Selecionar\nRestaurante}
    I1 -->|McDonald's| J1[CardapioMcDonalds.java]
    I1 -->|Pizza| J2[CardapioPizza.java]
    I1 -->|Açaí| J3[CardapioAcai.java]
    I1 -->|Dogão| J4[CardapioDogao.java]
    I1 -->|Voltar| G

    J1 & J2 & J3 & J4 --> K[Exibir cardápio\ncom preços]
    K --> K1[Selecionar item\ne quantidade]
    K1 --> L[Adicionar ao\nCarrinho.java]
    L --> L1{Continuar\ncomprando?}
    L1 -->|Sim| I
    L1 -->|Não| G

    M --> M1{Opções}
    M1 -->|Ver itens| M2[Exibir itens\ne total]
    M1 -->|Finalizar| P[/Compra.java\nFinalizacao.java/]
    M1 -->|Voltar| G
    M2 --> M1

    P --> P1{Forma de\nPagamento}
    P1 -->|Débito| Q1[Processar\ndébito]
    P1 -->|Crédito| Q2[Processar\ncrédito]
    P1 -->|PIX| Q3[Gerar\nchave PIX]

    Q1 & Q2 & Q3 --> R[Confirmar pedido]
    R --> S[Salvar em\nHistorico.java]
    S --> G

    O --> G
    N --> G
```

---

> **Projeto:** FastBite — Sistema de Pedidos de Fast Food  
> **Linguagem:** Java  
> **Pacotes:** `A_MenuInicial` · `B_Pedido` · `C_Cardapios`  
> **Renderização:** GitHub (Mermaid nativo — sem instalação necessária)
