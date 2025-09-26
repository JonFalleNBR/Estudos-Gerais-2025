TESTE DE AVALIAÇÃO TÉCNICA DE
PROGRAMADOR DE SOFTWARE –

MANUTENÇÃO

O seguinte teste foi desenvolvido com o objetivo de avaliar o pensamento lógico de um
desenvolvedor de software. Além disso, alguns dos pedidos estão ligados a outras habilidade
necessárias para o dia a dia na área de pós venda. Avaliamos um conjunto de habilidades tais
como, mas não limitadas a:
1. Análise e interpretação dos pedidos;
2. Resolução do problema;
3. Explicações da solução dada.
   Lembre-se de ler atentamente o que é solicitado nos enunciados do problema, isso faz parte da
   avaliação. Entretanto, não hesite em perguntar em caso de dúvida, isso não prejudicará a
   avaliação. Leia este documento por completo antes de começar. A avaliação da entrega levará
   em conta a posição/cargo da vaga. As explicações de contexto servem para mostrar o fluxo do
   trabalho que vai para além do trabalho do desenvolvedor.
   O contexto
   O cliente da Atech solicitou uma avaliação da capacidade necessária de um aeroporto para que
   atenda na sala de espera todos os passageiros até que os mesmos tomem o seu voo. Isso
   porque o mal dimensionamento já trouxe transtornos operacionais e o cliente está fazendo um
   estudo de redimensionamento das salas de espera. Em outras palavras, o cliente gostaria de
   saber qual foi a lotação máxima de uma sala de espera dado o horário de entrada e saída de
   cada um dos passageiros naquela sala controlada.
   A nossa equipe de negócios, que trata com o cliente, solicitou ao time técnico ajuda na solução
   desse problema. Nossa equipe técnica extraiu os dados do horário de entrada e de saída de
   cada passageiro no último período em diversas salas a partir dos dados fornecidos pelo cliente.
   Além disso, fez um trabalho de transformação dos dados de data a fim de facilitar a análise, de
   modo que os horários de entrada e saída de cada passageiro foram transformados em números
   entre 1 e 1000. Porém, para finalizar a análise foi solicitado a você o desenvolvimento do
   algoritmo que mostre a solução para cada conjunto de dados.
   O problema técnico
   Dado um número N de passageiros (1 &lt;= N &lt;= 100) que passaram pela sala de espera, uma lista
   E com os números do momento de entrada de cada passageiro e uma lista S com os números do
   momento de saída de cada passageiro, você deve fazer uma função que diga qual foi o número
   máximo de passageiros simultâneos naquela sala de espera durante todo o período. Considere
   que se um passageiro entra no mesmo momento que outro sai, então naquele instante só é
   contabilizada uma pessoa para a lotação da sala.
   Exemplos
1. Seja N = 3, E = [1,5,7] e S = [9,13,12], sabemos que o número máximo de passageiros
   simultaneamente na sala foi 3, pois o primeiro passageiro entrou no momento 1 e saiu no
   momento 9, o segundo passageiro entrou no momento 5 e saiu no momento 13 e o
   terceiro passageiro entrou no momento 7 e saiu no momento 12; portanto entre o
   momento 7 e 8 estavam todos os 3 passageiros simultaneamente na sala.

TESTE DE AVALIAÇÃO TÉCNICA DE
PROGRAMADOR DE SOFTWARE –

MANUTENÇÃO

2. Seja N = 4, E = [1,4,8,10] e S = [3,8,10,17], sabemos que o número máximo de
   passageiros simultaneamente na sala foi 1, pois o primeiro passageiro saiu antes do
   segundo chegar; o segundo saiu no mesmo momento que o terceiro chegou; e o terceiro
   saiu no mesmo momento que o quarto chegou; portanto em nenhum momento houve
   mais de um passageiro simultaneamente na sala de espera.
   O que esperamos da resolução
1. Que você faça um programa que imprima um número com a solução do problema descrito
   acima. Seu programa deve ler os dados da entrada padrão composta por 3 linhas, com a
   primeira contendo o número N, a segunda uma lista de números separadas por espaço
   contendo os valores da lista E e a terceira uma lista de números separadas por espaço
   contendo os valores da lista S. (Alternativamente você pode fazer uma função que receba
   os valores N, E e S como parâmetros e retorne um número inteiro com a resposta)
2. Que seja escrito um texto explicativo do algoritmo em forma técnica, cujo formato seja
   pensado para a leitura de uma equipe técnica de desenvolvedores;
3. Que seja escrito um texto explicativo da solução em forma leiga, ou seja, uma explicação
   cujo formato seja pensado para a leitura de uma equipe não técnica, que levará os dados
   finais ao nosso cliente;
   É desejável que o programa/função seja escrita em Java, porém pode ser utilizada qualquer outra
   linguagem de programação de sua preferência.


Foi utilizado Java 17 para essa solução.
E Inteligencia Artificial na refatoracao em busca de otimização do código.