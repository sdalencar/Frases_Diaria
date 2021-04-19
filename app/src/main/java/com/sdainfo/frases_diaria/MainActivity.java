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
                "O mundo pertence aos otimistas: os pessimistas são meros espectadores. \n\nautor: Dwight Eisenhower",
                "Enquanto houver vontade de lutar haverá esperança de vencer. \n\nautor: Santo Agostinho",
                "Imagine uma nova história para sua vida e acredite nela. \n\nautor: Paulo Coelho",
                "É pecado não ter esperança. \n\nautor: Clarice Lispector",
                "Pessimismo leva à fraqueza, otimismo ao poder. \n\nautor: William James",
                "O pessimista vê dificuldade em cada oportunidade; \no otimista vê oportunidade em cada dificuldade. \n\nautor: Winston Churchill",
                "A luz só ilumina na escuridão, por isso faça de toda escuridão uma oportunidade de brilhar. \n\nautor: desconhecido",
                "Pedras no caminho?\nEu guardo todas.\nUm dia vou construir um castelo. \n\nautor: Nemo Nox",
                "Um dia ruim não desfaz uma vida boa. Não desista! \n\nautor: Richie Norton",
                "Tudo o que um sonho precisa para ser realizado é alguém que acredite que ele possa ser realizado. \n\nautor: Roberto Shinyashiki",
                "Otimismo é a arte de enxergar borboletas onde todos só vêem lagartas. \n\nautor: desconhecido",
                "O pessimismo nunca venceu nenhuma batalha. \n\nautor: Dwight D. Eisenhower",
                "Tudo tem começo e meio. O fim só existe para quem não percebe o recomeço. \n\nautor: Luiz Gasparetto",
                "Receita da vida feliz: Algo para fazer, alguém para amar e esperança no futuro. \n\nautor: Elvis Presley",
                "Viver é a arte de não desistir! Por isso, coragem! \nEnquanto houver vida, haverá esperança! \n\nautor:desconnecido",
                "Vida é brisa passageira, então faça valer a pena. \n\nautor: PS. Eu Te Amo",
                "Há muito amor e esperança no mundo. \nEscolha olhar para eles! \n\nautor: desconhecido",
                "Quer você acredite que consiga fazer uma coisa ou não, você está certo. \n\nautor: Henry Ford",
                "Jamais se desespere em meio às sombrias aflições de sua vida, \npois das nuvens mais negras cai água límpida e fecunda. \n\nautor: Provérbio Chinês",
                "De que me adianta temer o que já aconteceu? \nO tempo do medo já aconteceu, agora, começa o tempo da esperança. \n\nautor: Paulo Coelho",
                "O que passou, passou, e o caminho adiante é você que faz! \nNão tenha medo das curvas, \nnem dos buracos, apenas garanta que a \nestrada seja florida e lembre de admirar a paisagem. \n\nautor: desconhecido",
                "Há pessoas que choram por saber que as rosas têm espinho. \nHá outras que sorriem por saber que os espinhos têm rosas! \n\nautor: Machado de Assis",
                "Enquanto houver um louco, um poeta e um \namante haverá sonho, amor e fantasia. \nE enquanto houver sonho, amor e fantasia, haverá esperança. \n\nautor: William Shakespeare",
                "Viver é acalentar sonhos e esperanças, fazendo da fé a nossa inspiração maior. \nÉ buscar nas pequenas coisas, um grande motivo para ser feliz! \n\nautor: Mario Quintana",
                "Lute com determinação, abrace a vida com paixão, perca com classe e vença com ousadia, \nporque o mundo pertence a quem se atreve e a vida é muito para ser insignificante. \n\nautor: Augusto Branco",
                "Faça o que for necessário para ser feliz. \nMas não se esqueça que a felicidade é um sentimento simples, \nvocê pode encontrá-la e deixá-la ir embora por não perceber sua simplicidade. \n\nautor: Martha Medeiros",
                "Desconfie do destino e acredite em você. \nGaste mais horas realizando que sonhando, \nfazendo que planejando, \nvivendo que esperando porque, \nembora quem quase morre esteja vivo, \nquem quase vive já morreu. \n\nautor: Sarah Westphal",
                "Atitude é uma escolha. Felicidade é uma escolha. \nOtimismo é uma escolha (...) \nTudo o que você escolhe fazer, faz quem você é. \nEscolha com sabedoria. \n\nautor: Roy T. Bennett",
                "Diga o que você pensa com esperança.\nPense no que você faz com fé.\nFaça o que você deve fazer com amor! \n\nautor: Ana Carolina",
                "Para encontrar a esperança é necessário ir além do desespero. \nQuando chegamos ao fim da noite, encontramos a aurora. \n\nautor: Georges Bernanos",
                "Quando não houver caminho.\nMesmo sem amor, sem direção.\nA sós ninguém está sozinho.\nÉ caminhando que se faz o caminho. \n\nautor: Sérgio Britto, Titãs",
                "Só existem dois dias no ano que nada pode ser feito. \nUm se chama ontem e o outro se chama amanhã. \nHoje é o dia certo para amar, acreditar, fazer e principalmente viver. \n\nautor: Dalai Lama",
                "As vezes não é fácil, mas é preciso coragem para ver a vida com outros olhos, \nencarar os desafios e escolher a esperança. \n\nautor: desconhecido",
                "Comece fazendo o que é necessário, \ndepois o que é possível, \ne de repente você estará fazendo o impossível. \n\nautor: São Francisco de Assis",
                "Não deixe as frustrações dominarem você, domine-as. \nFaça dos erros uma oportunidade para crescer. \nNa vida, erra quem não sabe lidar com seus fracassos. \n\nautor: Augusto Cury",
                "Enfrente seus obstáculos e faça alguma coisa em relação a eles. \nVocê descobrirá que eles não têm metade da força que você pensava que eles tinham. \n\nautor: Norman Vincent Peale",
                "Evite desencorajar-se: mantenha ocupações e faça do otimismo a maneira de viver. \nIsso restaura a fé em si. \n\nautor: Lucille Ball",
                "O sol nasceu, brilhou um novo dia, e com ele novas oportunidades surgirão e outras portas vão se abrir. \nPorque cada amanhecer é um recomeço, uma nova oportunidade de viver e de vencer. \n\nautor: desconhecido",
                "O homem não teria alcançado o possível se, \nrepetidas vezes, não tivesse tentado o impossível. \n\nautor: Max Weber",
                "Eu aprendi.\nQue sou mais forte que imaginava...\nQue posso ir mais longe depois de pensar que não podia mais...\nQue realmente a vida tem valor e eu tenho valor diante da vida! \n\nautor: Veronica Shoffstall",
                "Se você quer fazer do mundo um lugar melhor, \nolhe para si mesmo e faça uma mudança. \n\nautor: Michael Jackson ",
                "Seja sempre inquieto e vez por outra paciente, \nparece contraditório soa meio diferente mas às vezes pisar no freio também é andar pra frente. \n\nautor: Bráulio Bessa ",
                "Só eu sei cada passo por mim dado nessa estrada esburacada que é a vida,\npassei coisas que até mesmo Deus duvida,\nfiquei triste, capiongo, aperreado, porém nunca me senti desmotivado,\nme agarrava sempre numa mão amiga, e de forças minha alma era munida pois do céu a voz de Deus dizia assim:\n- Suba o queixo, meta os pés, confie em mim, vá pra luta que eu cuido das feridas. \n\nautor: Bráulio Bessa",
                "Recomece...\nSe refaça!\nRelembre o que foi bom.\nE se um dia lá na frente, a vida der uma ré, recupere a sua fé, e recomece novamente. \n\nautor: Bráulio Bessa",
                "Remarque aquele encontro.\nReconquiste um amor.\nReúna quem lhe quer bem.\nReconforte um sofredor.\nReanime quem tá triste e reaprenda na dor. \n\nautor: Bráulio Bessa",
                "E o amor é a própria cura.\nRemédio pra qualquer mal.\nCura o amado e quem ama.\nO diferente e o igual.\nTalvez seja essa a verdade:\nÉ pela anormalidade que todo AMOR é normal! \n\nautor: Bráulio Bessa",
                "Nada é definitivo, exceto a mudança. \nQuem é nascido do sol, não definha no calor. \n\nautor: Bráulio Bessa",
                "A mentira enfraquece e a verdade nos faz forte, \npara suportar qualquer dor, \ne para sarar qualquer corte. \n\nautor: Bráulio Bessa",
                "Não é produto de marca que define um cidadão.\nNunca julgue nessa vida um homem de pés no chão, \npois o sapato calça os pés mas, \nnão calça o coração. \n\nautor: Bráulio Bessa",
                "Na corrida dessa vida é preciso entender que você vai rastejar, \nque vai cair, \nvai sofrer.\nE a vida vai lhe ensinar que se aprende a caminhar e só depois correr. \n\nautor: Bráulio Bessa",
                "Às vezes eu tropeço, caio e me quebro em pedaços. \nIsso me fortalece.\nOxe, se um de mim já é forte, \nimagine vários! \n\nautor: Bráulio Bessa",
                "É preciso ser honesto pra cobrar honestidade, \né preciso ser sincero pra cobrar sinceridade.\nSó quem é verdadeiro pode cobrar a verdade! \n\nautor: Bráulio Bessa",
                "Repare: \ncada pessoa que torce por você é indispensável para a construção do seu sucesso. \nInclusive as que torcem contra! \n\nautor: Bráulio Bessa",
                "A única previsão que é certa sobre o tempo é que ele vai passar. \nPor isso cada momento deve ser aproveitado, vivido e depois guardado na caixa do pensamento. \n\nautor: Bráulio Bessa",
                "Sei que dar presente é bom mas bom mesmo é ser presente, \nser amigo, \nser parceiro ser o abraço mais quente permitir que nossos olhos não exerguem só a gente. \n\nautor: Bráulio Bessa.",
                "Enquanto o amor pesar mais que o mal na balança, \nenquanto existir pureza no olhar de uma criança, \nenquanto houver um abraço... \nHá de se ter esperança. \n\nautor: Bráulio Bessa",
                "Para o amor não há tempo nem idade, \no segredo é amar mais a cada dia\ne assim vamos seguindo a caminhada na certeza \nque o amor não foi em vão, \num para o outro,\ncomo o vento e o balão. \n\nautor: Bráulio Bessa",
                "Quando o amor pedir um pingo da sua atenção, \npor favor, chova! \n\nautor: Bráulio Bessa",
                "Seja amor, \nseja muito amor.\nE se mesmo assim for difícil ser,\nNão precisa ser perfeito,\nSe não der pra ser amor...\nQue seja ao menos respeito. \n\nautor: Bráulio Bessa",
                "O ideal é AMAR, \ninclusive o diferente. \nAfinal que graça tem amar uma cópia da gente? \n\nautor: Bráulio Bessa.",
                "Quer saber quanto custa uma saudade? \nTenha amor, \nqueira bem e viva ausente. \n\nautor: Bráulio Bessa",
                "É muito frustrante e, \nàs vezes, \ndesesperador quando não alcançamos algum objetivo que queríamos muito. \nMas, o importante é aproveitar o caminho! \n\nautor: Braulio Bessa",
                "Sonhar é verbo: \né seguir, é pensar, \ninspirar e fazer força, \ninsistir, é lutar, transpirar.\nSão mil verbos que vem antes do verbo realizar. \n\nautor: Bráulio Bessa",
                "Sonhe sempre e seja grato pelo sonho que já tem, \nrepare em cada detalhe que te faz bem.\nO pouco que hoje é seu já é muito pra alguém! \n\nautor: Bráulio Bessa",
                "Quando não houver caminho, \nnenhum lugar pra chegar.\nÉ hora do recomeço...\nRecomece a caminhar. \n\nautor: Bráulio Bessa",
                "O meu ou o seu caminho não são muito diferentes, \ntem espinho, pedra, buraco pra mode atrasar a gente mas, \nnão desanime por nada pois até uma topada empurra você pra frente. \n\nautor: Bráulio Bessa",
                "Seja um arquiteto dos seus sonhos, \num motorista da vida dirigindo no escuro, \num plantador de esperança cultivando em cada criança um adulto aonhador \n\nautor: Bráulio Bessa",

        };

        int indice = new Random().nextInt(frases.length);
        TextView mensagem = findViewById(R.id.textView);
        mensagem.setText(frases[indice]);
    }
}



















