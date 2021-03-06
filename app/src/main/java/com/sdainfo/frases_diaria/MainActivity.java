package com.sdainfo.frases_diaria;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mp;
    private int toque = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toque = 0;


    }


    public void tocar(View v){
        if (toque < 14 ){
            toque += 1;
        }else if (toque >= 14){
            toque = 0;
        }

        System.out.println(toque);
        switch (toque) {
            case 1:
                if (mp != null && mp.isPlaying()){
                    mp.stop();
                    mp.release();
                    mp = null;
                }else {
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.a);
                    mp.start();
                    mp.setLooping(true);
                }
                break;
            case 2:
                if (mp != null && mp.isPlaying()){
                    mp.stop();
                    mp.release();
                    mp = null;
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.b);
                    mp.start();
                    mp.setLooping(true);
                }
                break;
            case 3:
                if (mp != null && mp.isPlaying()){
                    mp.stop();
                    mp.release();
                    mp = null;
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.c);
                    mp.start();
                    mp.setLooping(true);
                }
                break;
            case 4:
                if (mp != null && mp.isPlaying()){
                    mp.stop();
                    mp.release();
                    mp = null;
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.d);
                    mp.start();
                    mp.setLooping(true);
                }
                break;
            case 5:
                if (mp != null && mp.isPlaying()){
                    mp.stop();
                    mp.release();
                    mp = null;
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.e);
                    mp.start();
                    mp.setLooping(true);
                }
                break;
            case 6:
                if (mp != null && mp.isPlaying()){
                    mp.stop();
                    mp.release();
                    mp = null;
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.f);
                    mp.start();
                    mp.setLooping(true);
                }
                break;
            case 7:
                if (mp != null && mp.isPlaying()){
                    mp.stop();
                    mp.release();
                    mp = null;
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.g);
                    mp.start();
                    mp.setLooping(true);
                }
                break;
            case 8:
                if (mp != null && mp.isPlaying()){
                    mp.stop();
                    mp.release();
                    mp = null;
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.h);
                    mp.start();
                    mp.setLooping(true);
                }
                break;
            case 9:
                if (mp != null && mp.isPlaying()){
                    mp.stop();
                    mp.release();
                    mp = null;
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.i);
                    mp.start();
                    mp.setLooping(true);
                }
                break;
            case 10:
                if (mp != null && mp.isPlaying()){
                    mp.stop();
                    mp.release();
                    mp = null;
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.j);
                    mp.start();
                    mp.setLooping(true);
                }
                break;
            case 11:
                if (mp != null && mp.isPlaying()){
                    mp.stop();
                    mp.release();
                    mp = null;
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.k);
                    mp.start();
                    mp.setLooping(true);
                }
                break;
            case 12:
                if (mp != null && mp.isPlaying()){
                    mp.stop();
                    mp.release();
                    mp = null;
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.l);
                    mp.start();
                    mp.setLooping(true);
                }
                break;
            case 13:
                if (mp != null && mp.isPlaying()){
                    mp.stop();
                    mp.release();
                    mp = null;
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.m);
                    mp.start();
                    mp.setLooping(true);
                }
                break;
            case 14:
                if (mp != null && mp.isPlaying()){
                    mp.stop();
                    mp.release();
                    mp = null;
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.n);
                    mp.start();
                    mp.setLooping(true);
                }
                break;
            default:
                if (mp != null && mp.isPlaying()){
                    mp.stop();
                    mp.release();
                    mp = null;
                }
                break;
            }

        }



    public void criar(View view) {
        String[] frases = {
                "O mundo pertence aos otimistas: os pessimistas s??o meros espectadores. \n\nautor: Dwight Eisenhower",
                "Enquanto houver vontade de lutar haver?? esperan??a de vencer. \n\nautor: Santo Agostinho",
                "Imagine uma nova hist??ria para sua vida e acredite nela. \n\nautor: Paulo Coelho",
                "?? pecado n??o ter esperan??a. \n\nautor: Clarice Lispector",
                "Pessimismo leva ?? fraqueza, otimismo ao poder. \n\nautor: William James",
                "O pessimista v?? dificuldade em cada oportunidade; \no otimista v?? oportunidade em cada dificuldade. \n\nautor: Winston Churchill",
                "A luz s?? ilumina na escurid??o, por isso fa??a de toda escurid??o uma oportunidade de brilhar. \n\nautor: desconhecido",
                "Pedras no caminho?\nEu guardo todas.\nUm dia vou construir um castelo. \n\nautor: Nemo Nox",
                "Um dia ruim n??o desfaz uma vida boa. N??o desista! \n\nautor: Richie Norton",
                "Tudo o que um sonho precisa para ser realizado ?? algu??m que acredite que ele possa ser realizado. \n\nautor: Roberto Shinyashiki",
                "Otimismo ?? a arte de enxergar borboletas onde todos s?? v??em lagartas. \n\nautor: desconhecido",
                "O pessimismo nunca venceu nenhuma batalha. \n\nautor: Dwight D. Eisenhower",
                "Tudo tem come??o e meio. O fim s?? existe para quem n??o percebe o recome??o. \n\nautor: Luiz Gasparetto",
                "Receita da vida feliz: Algo para fazer, algu??m para amar e esperan??a no futuro. \n\nautor: Elvis Presley",
                "Viver ?? a arte de n??o desistir! Por isso, coragem! \nEnquanto houver vida, haver?? esperan??a! \n\nautor:desconnecido",
                "Vida ?? brisa passageira, ent??o fa??a valer a pena. \n\nautor: PS. Eu Te Amo",
                "H?? muito amor e esperan??a no mundo. \nEscolha olhar para eles! \n\nautor: desconhecido",
                "Quer voc?? acredite que consiga fazer uma coisa ou n??o, voc?? est?? certo. \n\nautor: Henry Ford",
                "Jamais se desespere em meio ??s sombrias afli????es de sua vida, \npois das nuvens mais negras cai ??gua l??mpida e fecunda. \n\nautor: Prov??rbio Chin??s",
                "De que me adianta temer o que j?? aconteceu? \nO tempo do medo j?? aconteceu, agora, come??a o tempo da esperan??a. \n\nautor: Paulo Coelho",
                "O que passou, passou, e o caminho adiante ?? voc?? que faz! \nN??o tenha medo das curvas, \nnem dos buracos, apenas garanta que a \nestrada seja florida e lembre de admirar a paisagem. \n\nautor: desconhecido",
                "H?? pessoas que choram por saber que as rosas t??m espinho. \nH?? outras que sorriem por saber que os espinhos t??m rosas! \n\nautor: Machado de Assis",
                "Enquanto houver um louco, um poeta e um \namante haver?? sonho, amor e fantasia. \nE enquanto houver sonho, amor e fantasia, haver?? esperan??a. \n\nautor: William Shakespeare",
                "Viver ?? acalentar sonhos e esperan??as, fazendo da f?? a nossa inspira????o maior. \n?? buscar nas pequenas coisas, um grande motivo para ser feliz! \n\nautor: Mario Quintana",
                "Lute com determina????o, abrace a vida com paix??o, perca com classe e ven??a com ousadia, \nporque o mundo pertence a quem se atreve e a vida ?? muito para ser insignificante. \n\nautor: Augusto Branco",
                "Fa??a o que for necess??rio para ser feliz. \nMas n??o se esque??a que a felicidade ?? um sentimento simples, \nvoc?? pode encontr??-la e deix??-la ir embora por n??o perceber sua simplicidade. \n\nautor: Martha Medeiros",
                "Desconfie do destino e acredite em voc??. \nGaste mais horas realizando que sonhando, \nfazendo que planejando, \nvivendo que esperando porque, \nembora quem quase morre esteja vivo, \nquem quase vive j?? morreu. \n\nautor: Sarah Westphal",
                "Atitude ?? uma escolha. Felicidade ?? uma escolha. \nOtimismo ?? uma escolha (...) \nTudo o que voc?? escolhe fazer, faz quem voc?? ??. \nEscolha com sabedoria. \n\nautor: Roy T. Bennett",
                "Diga o que voc?? pensa com esperan??a.\nPense no que voc?? faz com f??.\nFa??a o que voc?? deve fazer com amor! \n\nautor: Ana Carolina",
                "Para encontrar a esperan??a ?? necess??rio ir al??m do desespero. \nQuando chegamos ao fim da noite, encontramos a aurora. \n\nautor: Georges Bernanos",
                "Quando n??o houver caminho.\nMesmo sem amor, sem dire????o.\nA s??s ningu??m est?? sozinho.\n?? caminhando que se faz o caminho. \n\nautor: S??rgio Britto, Tit??s",
                "S?? existem dois dias no ano que nada pode ser feito. \nUm se chama ontem e o outro se chama amanh??. \nHoje ?? o dia certo para amar, acreditar, fazer e principalmente viver. \n\nautor: Dalai Lama",
                "As vezes n??o ?? f??cil, mas ?? preciso coragem para ver a vida com outros olhos, \nencarar os desafios e escolher a esperan??a. \n\nautor: desconhecido",
                "Comece fazendo o que ?? necess??rio, \ndepois o que ?? poss??vel, \ne de repente voc?? estar?? fazendo o imposs??vel. \n\nautor: S??o Francisco de Assis",
                "N??o deixe as frustra????es dominarem voc??, domine-as. \nFa??a dos erros uma oportunidade para crescer. \nNa vida, erra quem n??o sabe lidar com seus fracassos. \n\nautor: Augusto Cury",
                "Enfrente seus obst??culos e fa??a alguma coisa em rela????o a eles. \nVoc?? descobrir?? que eles n??o t??m metade da for??a que voc?? pensava que eles tinham. \n\nautor: Norman Vincent Peale",
                "Evite desencorajar-se: mantenha ocupa????es e fa??a do otimismo a maneira de viver. \nIsso restaura a f?? em si. \n\nautor: Lucille Ball",
                "O sol nasceu, brilhou um novo dia, e com ele novas oportunidades surgir??o e outras portas v??o se abrir. \nPorque cada amanhecer ?? um recome??o, uma nova oportunidade de viver e de vencer. \n\nautor: desconhecido",
                "O homem n??o teria alcan??ado o poss??vel se, \nrepetidas vezes, n??o tivesse tentado o imposs??vel. \n\nautor: Max Weber",
                "Eu aprendi.\nQue sou mais forte que imaginava...\nQue posso ir mais longe depois de pensar que n??o podia mais...\nQue realmente a vida tem valor e eu tenho valor diante da vida! \n\nautor: Veronica Shoffstall",
                "Se voc?? quer fazer do mundo um lugar melhor, \nolhe para si mesmo e fa??a uma mudan??a. \n\nautor: Michael Jackson ",
                "Seja sempre inquieto e vez por outra paciente, \nparece contradit??rio soa meio diferente mas ??s vezes pisar no freio tamb??m ?? andar pra frente. \n\nautor: Br??ulio Bessa ",
                "S?? eu sei cada passo por mim dado nessa estrada esburacada que ?? a vida,\npassei coisas que at?? mesmo Deus duvida,\nfiquei triste, capiongo, aperreado, por??m nunca me senti desmotivado,\nme agarrava sempre numa m??o amiga, e de for??as minha alma era munida pois do c??u a voz de Deus dizia assim:\n- Suba o queixo, meta os p??s, confie em mim, v?? pra luta que eu cuido das feridas. \n\nautor: Br??ulio Bessa",
                "Recomece...\nSe refa??a!\nRelembre o que foi bom.\nE se um dia l?? na frente, a vida der uma r??, recupere a sua f??, e recomece novamente. \n\nautor: Br??ulio Bessa",
                "Remarque aquele encontro.\nReconquiste um amor.\nRe??na quem lhe quer bem.\nReconforte um sofredor.\nReanime quem t?? triste e reaprenda na dor. \n\nautor: Br??ulio Bessa",
                "E o amor ?? a pr??pria cura.\nRem??dio pra qualquer mal.\nCura o amado e quem ama.\nO diferente e o igual.\nTalvez seja essa a verdade:\n?? pela anormalidade que todo AMOR ?? normal! \n\nautor: Br??ulio Bessa",
                "Nada ?? definitivo, exceto a mudan??a. \nQuem ?? nascido do sol, n??o definha no calor. \n\nautor: Br??ulio Bessa",
                "A mentira enfraquece e a verdade nos faz forte, \npara suportar qualquer dor, \ne para sarar qualquer corte. \n\nautor: Br??ulio Bessa",
                "N??o ?? produto de marca que define um cidad??o.\nNunca julgue nessa vida um homem de p??s no ch??o, \npois o sapato cal??a os p??s mas, \nn??o cal??a o cora????o. \n\nautor: Br??ulio Bessa",
                "Na corrida dessa vida ?? preciso entender que voc?? vai rastejar, \nque vai cair, \nvai sofrer.\nE a vida vai lhe ensinar que se aprende a caminhar e s?? depois correr. \n\nautor: Br??ulio Bessa",
                "??s vezes eu trope??o, caio e me quebro em peda??os. \nIsso me fortalece.\nOxe, se um de mim j?? ?? forte, \nimagine v??rios! \n\nautor: Br??ulio Bessa",
                "?? preciso ser honesto pra cobrar honestidade, \n?? preciso ser sincero pra cobrar sinceridade.\nS?? quem ?? verdadeiro pode cobrar a verdade! \n\nautor: Br??ulio Bessa",
                "Repare: \ncada pessoa que torce por voc?? ?? indispens??vel para a constru????o do seu sucesso. \nInclusive as que torcem contra! \n\nautor: Br??ulio Bessa",
                "A ??nica previs??o que ?? certa sobre o tempo ?? que ele vai passar. \nPor isso cada momento deve ser aproveitado, vivido e depois guardado na caixa do pensamento. \n\nautor: Br??ulio Bessa",
                "Sei que dar presente ?? bom mas bom mesmo ?? ser presente, \nser amigo, \nser parceiro ser o abra??o mais quente permitir que nossos olhos n??o exerguem s?? a gente. \n\nautor: Br??ulio Bessa.",
                "Enquanto o amor pesar mais que o mal na balan??a, \nenquanto existir pureza no olhar de uma crian??a, \nenquanto houver um abra??o... \nH?? de se ter esperan??a. \n\nautor: Br??ulio Bessa",
                "Para o amor n??o h?? tempo nem idade, \no segredo ?? amar mais a cada dia\ne assim vamos seguindo a caminhada na certeza \nque o amor n??o foi em v??o, \num para o outro,\ncomo o vento e o bal??o. \n\nautor: Br??ulio Bessa",
                "Quando o amor pedir um pingo da sua aten????o, \npor favor, chova! \n\nautor: Br??ulio Bessa",
                "Seja amor, \nseja muito amor.\nE se mesmo assim for dif??cil ser,\nN??o precisa ser perfeito,\nSe n??o der pra ser amor...\nQue seja ao menos respeito. \n\nautor: Br??ulio Bessa",
                "O ideal ?? AMAR, \ninclusive o diferente. \nAfinal que gra??a tem amar uma c??pia da gente? \n\nautor: Br??ulio Bessa.",
                "Quer saber quanto custa uma saudade? \nTenha amor, \nqueira bem e viva ausente. \n\nautor: Br??ulio Bessa",
                "?? muito frustrante e, \n??s vezes, \ndesesperador quando n??o alcan??amos algum objetivo que quer??amos muito. \nMas, o importante ?? aproveitar o caminho! \n\nautor: Braulio Bessa",
                "Sonhar ?? verbo: \n?? seguir, ?? pensar, \ninspirar e fazer for??a, \ninsistir, ?? lutar, transpirar.\nS??o mil verbos que vem antes do verbo realizar. \n\nautor: Br??ulio Bessa",
                "Sonhe sempre e seja grato pelo sonho que j?? tem, \nrepare em cada detalhe que te faz bem.\nO pouco que hoje ?? seu j?? ?? muito pra algu??m! \n\nautor: Br??ulio Bessa",
                "Quando n??o houver caminho, \nnenhum lugar pra chegar.\n?? hora do recome??o...\nRecomece a caminhar. \n\nautor: Br??ulio Bessa",
                "O meu ou o seu caminho n??o s??o muito diferentes, \ntem espinho, pedra, buraco pra mode atrasar a gente mas, \nn??o desanime por nada pois at?? uma topada empurra voc?? pra frente. \n\nautor: Br??ulio Bessa",
                "Seja um arquiteto dos seus sonhos, \num motorista da vida dirigindo no escuro, \num plantador de esperan??a cultivando em cada crian??a um adulto aonhador \n\nautor: Br??ulio Bessa",

        };

        int indice = new Random().nextInt(frases.length);
        TextView mensagem = findViewById(R.id.textView);
        mensagem.setText(frases[indice]);
    }
}



















