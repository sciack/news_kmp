package news

val topNewsJson = """
{
  "status": "ok",
  "totalResults": 87,
  "articles": [
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "Ben Eisen, Rachel Louise Ensign",
      "title": "Banks Don’t Love Rich Mortgage Borrowers as Much as They Used To",
      "description": "The Fed’s interest-rate hikes and recent bank failures mean lenders aren’t competing so fiercely for jumbo loans",
      "url": "https://www.wsj.com/finance/banking/mortgage-jumbo-loan-interest-rates-wealthy-a84e87d3",
      "urlToImage": "https://images.wsj.net/im-837888/social",
      "publishedAt": "2023-08-21T04:00:00Z",
      "content": "Sheila Smith was set to get a mortgage for about ${'$'}750,000 to buy an investment property in Sedona, Ariz., earlier this year. The lender, a regional bank, offered a starting interest rate of about 5%,… [+127 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Florida Teachers on Edge Over History and Gender-Identity Policies...",
      "description": "Educators are under pressure balancing instruction and compliance with new laws",
      "url": "https://www.wsj.com/us-news/education/florida-teachers-are-on-edge-over-history-and-gender-identity-policies-e96d4dd6",
      "urlToImage": "https://images.wsj.net/im-838673/social",
      "publishedAt": "2023-08-20T22:00:03Z",
      "content": "Florida Teachers Are on Edge Over History and Gender-Identity Policies Carol Cleaver, a middle-school teacher in Pensacola, Fla., said she is keeping her books locked away in her classroom because sh… [+753 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "America's Tech Giants Rush to Comply With New Rules in Europe...",
      "description": "Google, Meta Platforms and others are set to face regulations that resemble the detail and sweep of those imposed on banks",
      "url": "https://www.wsj.com/tech/americas-tech-giants-rush-to-comply-with-new-curbs-in-europe-2076ade9",
      "urlToImage": "https://images.wsj.net/im-838647/social",
      "publishedAt": "2023-08-20T22:00:03Z",
      "content": "America’s Tech Giants Rush to Comply With New Curbs in EuropeBy and Updated Aug. 20, 2023 2:55 pm ET\r\nBRUSSELS—The hammer is about to come down on some of the world’s biggest tech companies.Copyright… [+656 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "China's 40-Year Boom Is Over. What Comes Next?",
      "description": "The economic model that took the country from poverty to great-power status seems broken, and everywhere are signs of distress",
      "url": "https://www.wsj.com/world/china/china-economy-debt-slowdown-recession-622a3be4",
      "urlToImage": "https://images.wsj.net/im-838495/social",
      "publishedAt": "2023-08-20T13:00:02Z",
      "content": "China’s 40-Year Boom Is Over. What Comes Next?For decades, China powered its economy by investing in factories, skyscrapers and roads. The model sparked an extraordinary period of growth that lifted … [+731 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Romney's Political Journey Reaches Crossroads...",
      "description": "Republican senator from Utah, an outspoken critic of Donald Trump, would face a tough fight if he seeks re-election",
      "url": "https://www.wsj.com/politics/policy/mitt-romney-reelection-senate-utah-trump-bf6f386a",
      "urlToImage": "https://images.wsj.net/im-835268/social",
      "publishedAt": "2023-08-20T12:00:06Z",
      "content": "Mitt Romney’s Political Journey Reaches a CrossroadsSen. Mitt Romney has to decide if he has another fight in him.Copyright ©2023 Dow Jones & Company, Inc. All Rights Reserved. 87990cbe856818d5eddac4… [+555 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "David Uberti",
      "title": "U.S. Has Fewest Active Oil Rigs Since the Ukraine War's First Days",
      "description": "Live updates on what's moving markets, including the Dow Jones Industrial Average, Nasdaq Composite and S&P 500",
      "url": "https://www.wsj.com/livecoverage/stock-market-today-dow-jones-08-18-2023",
      "urlToImage": "https://images.wsj.net/im-793474/social",
      "publishedAt": "2023-08-18T18:14:27Z",
      "content": "American oil producers have fewer rigs actively drilling than at any point since the first days of the Ukraine war, suggesting they are pessimistic about prices.\r\nU.S. drillers had 520 rigs up and ru… [+455 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Hundreds of Gun Dealers Lose Licenses Under Biden Crackdown...",
      "description": "After years of light enforcement to encourage cooperation, ATF is clamping down on firearm sellers, who say they are being unfairly targeted",
      "url": "https://www.wsj.com/us-news/law/hundreds-of-gun-dealers-lose-licenses-under-biden-administration-crackdown-da9d6dfb",
      "urlToImage": "https://images.wsj.net/im-835572/social",
      "publishedAt": "2023-08-18T14:00:03Z",
      "content": "Hundreds of Gun Dealers Lose Licenses Under Biden Administration CrackdownBy Aug. 18, 2023 9:00 am ET\r\nThe Biden administration is revoking licenses from hundreds of firearms dealers in a significant… [+767 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "OZEMPIC Craze Could Put These Companies on Crash Diet...",
      "description": "Anti-obesity medications could affect industries that benefit from America’s food problem",
      "url": "https://www.wsj.com/health/healthcare/ozempic-mounjaro-wegovy-eli-lilly-novo-nordisk-stock-87d9d1d6",
      "urlToImage": "https://images.wsj.net/im-837674/social",
      "publishedAt": "2023-08-18T12:00:03Z",
      "content": "The Ozempic Craze Could Put These Companies on a Crash DietBy Aug. 18, 2023 5:30 am ETThe obesity epidemic has taken a horrible toll on Americans, and not just their health: It costs the country abou… [+753 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Investors Fear China's 'Lehman Moment' Looming...",
      "description": "Troubles at a big trust company are making investors worry about financial contagion from property developers’ distress",
      "url": "https://www.wsj.com/finance/investing/investors-fear-chinas-lehman-moment-is-looming-4364855d",
      "urlToImage": "https://images.wsj.net/im-837775/social",
      "publishedAt": "2023-08-18T12:00:03Z",
      "content": "Investors Fear China’s ‘Lehman Moment’ Is LoomingBy and Aug. 18, 2023 5:43 am ET\r\nSigns of financial stress at a large asset manager in China are making investors nervous about contagion from the cou… [+786 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Trump Indicted. DeSantis Struggling. Is This Tim Scott's Moment?",
      "description": "South Carolina senator’s polling numbers have ticked up as he campaigns with a sunny disposition",
      "url": "https://www.wsj.com/articles/tim-scott-trump-desantis-iowa-gop-2024-f5e9ab4b",
      "urlToImage": "https://images.wsj.net/im-837061/social",
      "publishedAt": "2023-08-17T14:00:02Z",
      "content": "Trump Indicted. DeSantis Struggling. Is This Tim Scott’s Moment?DES MOINES, Iowa—Sen. Tim Scott has a window of opportunity in the Republican presidential primary race as the top two polling candidat… [+1275 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "Jack Pitcher",
      "title": "Hawaiian Electric Stock Tumbles After Restructuring Report",
      "description": "Live coverage of stocks and financial news, including the S&P 500, Dow and Nasdaq Composite.",
      "url": "https://www.wsj.com/livecoverage/stock-market-today-dow-jones-08-17-2023",
      "urlToImage": "https://images.wsj.net/im-785590/social",
      "publishedAt": "2023-08-17T12:32:21Z",
      "content": "Hawaiian Electric shares fell around 26% in premarket trading Thursday after The Wall Street Journal reported that the utility company is in talks with firms that specialize in restructuring advisory… [+325 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Too Many Vacant Lots, Not Enough Housing: The Real-Estate Puzzle...",
      "description": "In Chicago, Pittsburgh and Detroit neighborhoods where houses are surrounded by empty lots, authorities are starting to bulldoze obstacles to development",
      "url": "https://www.wsj.com/real-estate/too-many-vacant-lots-not-enough-housing-the-u-s-real-estate-puzzle-2aa19733",
      "urlToImage": "https://images.wsj.net/im-828639/social",
      "publishedAt": "2023-08-17T11:00:02Z",
      "content": "Too Many Vacant Lots, Not Enough Housing: The U.S. Real-Estate PuzzleCHICAGO—DaJuan Robinson was remodeling a house on the South Side, not far from the University of Chicago, when he spotted a vacant… [+742 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "Vicky Ge Huang",
      "title": "Coinbase Gets NFA Approval to Offer Crypto Futures",
      "description": "Cisco and Target are among companies reporting results Wednesday",
      "url": "https://www.wsj.com/livecoverage/stock-market-today-dow-jones-08-16-2023",
      "urlToImage": "https://images.wsj.net/im-836261/social",
      "publishedAt": "2023-08-16T10:00:00Z",
      "content": "Coinbase Global has earned approval from the National Futures Association to offer eligible U.S. customers crypto futures, the company said Wednesday.\r\nThe largest crypto exchange in the U.S. in Sept… [+469 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "Gina Heeb",
      "title": "Discover Stock Drops After CEO's Exit",
      "description": "Live coverage of stocks and financial news, including the S&P 500, Dow and Nasdaq Composite.",
      "url": "https://www.wsj.com/livecoverage/stock-market-today-dow-jones-08-15-2023",
      "urlToImage": "https://images.wsj.net/im-835879?width=600",
      "publishedAt": "2023-08-15T15:15:00Z",
      "content": "Discover Financial shares dropped 9% Tuesday after the Riverwoods-Ill.-based company said Roger Hochschild would step down as CEO effective immediately.\r\nDiscover board member and ex-Regions Financia… [+457 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "Alex Janin",
      "title": "Stand Outside Barefoot for Better Health? 'It Works'...",
      "description": "Pilots, pro athletes and others try ’grounding’—though don’t step on a bee. ‘I said a couple of bad words to myself.’",
      "url": "https://www.wsj.com/articles/earthing-grounding-wellness-tiktok-trend-c9d82ca5",
      "urlToImage": "https://images.wsj.net/im-834253/social",
      "publishedAt": "2023-08-15T14:31:37Z",
      "content": "When Sara Jean Meyer got a text from her mom that said, I have a surprise for you, she assumed it would be a free bubble tea. Instead, her mother showed up with a roll of foil tape, a long copper pip… [+138 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "Dave Sebastian",
      "title": "Cosmetics Billionaire Mulls ${'$'}4.9 Billion-Plus Buyout of L'Occitane",
      "description": "Key stock indexes in Asia fell Monday",
      "url": "https://www.wsj.com/livecoverage/stock-market-today-dow-jones-08-14-2023",
      "urlToImage": "https://images.wsj.net/im-834974/social",
      "publishedAt": "2023-08-14T09:57:30Z",
      "content": "The billionaire chairman of L'Occitane International is considering taking full control of the European cosmetics and fragrance brand.\r\nThe company's Hong Kong-listed shares jumped 8.8% on Monday, af… [+366 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "Jen Murphy",
      "title": "Doing Pull-Ups Gives Women a Fitness Lift",
      "description": "As women embrace strength training, executing this \"unicorn exercise\" has become a way for many to show just how strong they are",
      "url": "https://www.wsj.com/story/doing-pull-ups-gives-women-a-fitness-lift-e9d54c59",
      "urlToImage": "https://images.wsj.net/im-829278/social",
      "publishedAt": "2023-08-14T03:41:42Z",
      "content": "Harrison set herself a goal of doing an unassisted pull-up before she turns 48 this month, and 10 by October.\r\nShe has received dozens of supportive messages since she began posting about pull-ups in… [+9 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Kyiv Steps Up Campaign to Isolate Crimea...",
      "description": "Kyiv aims to constrict the flow of Russian supplies from the peninsula to the front line as Ukraine’s counteroffensive makes slow progress",
      "url": "https://www.wsj.com/articles/ukraine-steps-up-campaign-to-isolate-russian-occupied-crimea-b11e4d01",
      "urlToImage": "https://images.wsj.net/im-834742/social",
      "publishedAt": "2023-08-12T18:00:02Z",
      "content": "Ukraine Steps Up Campaign to Isolate Russian-Occupied CrimeaBy and Updated Aug. 12, 2023 1:02 pm ET\r\nUkraine targeted the only bridge linking Crimea to the Russian mainland on Saturday, stepping up a… [+718 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Warnings years ago...",
      "description": "‘It’s just really frustrating and heartbreaking to see that some things could have been done,’ says author of 2014 report",
      "url": "https://www.wsj.com/articles/hawaii-maui-fire-risks-plans-government-e883f3a3",
      "urlToImage": "https://images.wsj.net/im-834584/social",
      "publishedAt": "2023-08-12T14:00:02Z",
      "content": "Hawaii Officials Were Warned Years Ago That Maui’s Lahaina Faced High Wildfire RiskNearly a decade before a wildfire destroyed the coastal Maui town of Lahaina this week, killing at least 80 people, … [+715 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Could Third Party Finally Do It?",
      "description": "Many Americans dread the prospect of a 2020 presidential rematch and want an alternative, but complications abound",
      "url": "https://www.wsj.com/articles/could-a-third-party-finally-do-it-688edc4f",
      "urlToImage": "https://images.wsj.net/im-833430/social",
      "publishedAt": "2023-08-11T19:00:02Z",
      "content": "Essay | Could a Third Party Finally Do It?The recent history of independent and third-party presidential runs in this country is easy to summarize: High hopes followed by dashed expectations.Copyrigh… [+600 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "Candice Choi",
      "title": "Own a Piece of First Republic History: The Corporate Jet Is for Sale",
      "description": "Live coverage of what's moving stocks and markets, including the Dow Jones Industrial Average, S&P 500 and Nasdaq Composite",
      "url": "https://www.wsj.com/livecoverage/stock-market-today-dow-jones-08-11-2023",
      "urlToImage": "https://images.wsj.net/im-833981/social",
      "publishedAt": "2023-08-11T14:23:02Z",
      "content": "For anyone in the market for a corporate jet, federal regulators have just the thing for you.\r\nThe Federal Deposit Insurance Corp. is selling a spectacular corporate jet that can accommodate 13 passe… [+545 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "AI Mania Triggers Dot-Com Bubble Flashbacks...",
      "description": "Nvidia shares have nearly tripled this year. Investors question whether the stock can live up to the hype.",
      "url": "https://www.wsj.com/articles/ai-mania-triggers-dot-com-bubble-flashbacks-7848d402",
      "urlToImage": "https://images.wsj.net/im-831662/social",
      "publishedAt": "2023-08-11T12:00:03Z",
      "content": "AI Mania Triggers Dot-Com Bubble FlashbacksBy Updated Aug. 11, 2023 12:00 am ETThe dot-com bubble taught investors to be wary of stock-market rallies powered by a technological boom—that is, until ge… [+702 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Russia Aims to Restore Prestige in Race to Moon's South Pole...",
      "description": "Success could signal Moscow’s ability to overcome sanctions and demonstrate its technological prowess, but the challenges are severe",
      "url": "https://www.wsj.com/articles/russia-aims-to-restore-prestige-in-race-to-moons-south-pole-86c25170",
      "urlToImage": "https://images.wsj.net/im-833990/social",
      "publishedAt": "2023-08-11T11:00:02Z",
      "content": "Russia Aims to Restore Prestige in Race to Moon’s South PoleRussia’s launch of its first lunar lander in nearly 50 years on Friday, an attempt to become the first country to reach the south pole of t… [+804 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "To Battle New Threats, Spy Agencies to Share More Intel With Private Sector...",
      "description": "Pandemics, cyberattacks and supply-chain disruptions are pushing government to work more with outside groups",
      "url": "https://www.wsj.com/articles/to-battle-new-threats-spy-agencies-to-share-more-intelligence-with-private-sector-db25e36",
      "urlToImage": "https://images.wsj.net/im-832903/social",
      "publishedAt": "2023-08-10T18:00:03Z",
      "content": "To Battle New Threats, Spy Agencies to Share More Intelligence With Private SectorBy Aug. 10, 2023 9:00 am ET\r\nWASHINGTON—U.S. spy agencies will share more intelligence with U.S. companies, nongovern… [+873 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "After Absence Induced by Anxiety, PGA Tour Chief Admits Mistakes...",
      "description": "Jay Monahan, in his first remarks since returning from a medical leave, took responsibility for the rollout of the preliminary agreement with LIV Golf’s backers but defended the pact",
      "url": "https://www.wsj.com/sports/golf/jay-monahan-pga-tour-liv-golf-saudi-deal-medical-leave-c05387d7",
      "urlToImage": "https://images.wsj.net/im-831429/social",
      "publishedAt": "2023-08-09T22:00:03Z",
      "content": "After Absence Induced by Anxiety, PGA Tour Chief Admits Mistakes With Saudi DealBy Aug. 9, 2023 1:49 pm ETMEMPHIS, Tenn.—PGA Tour commissioner Jay Monahan admitted to making mistakes in how he rolled… [+887 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Even Germany Can't Get Trains to Run on Time...",
      "description": "Chronically late Deutsche Bahn resorts to scent therapy to placate passengers; ‘a cultural crisis’",
      "url": "https://www.wsj.com/articles/germany-late-trains-national-psyche-7d84166f",
      "urlToImage": "https://images.wsj.net/im-831872/social",
      "publishedAt": "2023-08-09T18:00:03Z",
      "content": "Even Germany Can’t Get Its Trains to Run on Time. ‘This Is an Embarrassment’ By Updated Aug. 9, 2023 12:12 am ETGermany, the land of meticulous planning and clockwork punctuality, can’t seem to make … [+646 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Saudi-USA Deal to Normalize Kingdom's Ties With Israel?",
      "description": "Officials are negotiating details of agreement they hope to cement within nine-to-12 months, though obstacles remain",
      "url": "https://www.wsj.com/articles/u-s-saudi-arabia-agree-to-broad-terms-for-israel-normalization-ac6d549c",
      "urlToImage": "https://images.wsj.net/im-832348/social",
      "publishedAt": "2023-08-09T18:00:03Z",
      "content": "Saudis Agree With U.S. on Path to Normalize Kingdom’s Ties With IsraelBy Updated Aug. 9, 2023 12:30 pm ET\r\nWASHINGTON—The U.S. and Saudi Arabia have agreed on the broad contours of a deal for Saudi A… [+814 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Women's Problem Drinking Catching Up to Men's...",
      "description": "On the rise for the past two decades, women’s alcohol use jumped during the pandemic",
      "url": "https://www.wsj.com/articles/women-problem-drinking-alcohol-increasing-6aa9891c",
      "urlToImage": "https://images.wsj.net/im-831189/social",
      "publishedAt": "2023-08-08T20:00:04Z",
      "content": "Women’s Problem Drinking Is Catching Up to Men’sBy Aug. 8, 2023 9:00 am ETWomen are closing a gender gap, but it isn’t a good one: They’re catching up to men when it comes to problem drinking.Copyrig… [+623 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "Josh Mitchell",
      "title": "M&T Bank, Pinnacle and Commerce Bancshares Stocks Drop After Moody's Downgrades Regional Banks",
      "description": "Live coverage of stocks and financial news, including the S&P 500, Dow and Nasdaq Composite",
      "url": "https://www.wsj.com/livecoverage/stock-market-today-dow-jones-08-08-2023",
      "urlToImage": "https://images.wsj.net/im-831456/social",
      "publishedAt": "2023-08-08T13:49:44Z",
      "content": "Moody's Investors Service cut the credit ratings of 10 U.S. regional banks and said it was reviewing the ratings of six other institutions, pointing to lower profits and higher funding costs.\r\nShares… [+457 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Midnight Dog Walks, 1 a.m. Shopping: Heat Has People Living at Night...",
      "description": "As daytime temperatures soar, folks are moving their daily activities to cooler nights",
      "url": "https://www.wsj.com/articles/how-heat-changes-sleep-work-shopping-d3efe4d8",
      "urlToImage": "https://images.wsj.net/im-830026/social",
      "publishedAt": "2023-08-08T11:00:03Z",
      "content": "Midnight Dog Walks and 1 a.m. Shopping: The Heat Has People Living at NightCall them heat vampires. Copyright ©2023 Dow Jones & Company, Inc. All Rights Reserved. 87990cbe856818d5eddac44c7b1cdeb8Cont… [+553 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Satire a Casualty as Arab Nations Clamp Down on Free Speech...",
      "description": "AlHudood, the Onion of the Middle East, was banned in Jordan ahead of new law to curb online criticism",
      "url": "https://www.wsj.com/articles/satire-a-casualty-as-arab-nations-clamp-down-on-free-speech-5705dd73",
      "urlToImage": "https://images.wsj.net/im-831297/social",
      "publishedAt": "2023-08-08T11:00:03Z",
      "content": "Satire a Casualty as Arab Nations Clamp Down on Free SpeechBy and Updated Aug. 8, 2023 12:00 am ET\r\nLONDON—Isam Uraiqat spent years testing the line in the Middle East between satire and insult.Copyr… [+661 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "MCGURN: Trump's Last Hurrah...",
      "description": "James Michael Curley shows that a federal prison sentence is no bar to elective office.",
      "url": "https://www.wsj.com/articles/donald-trumps-last-hurrah-election-mug-shot-campaign-2024-james-michael-curley-58abc6b",
      "urlToImage": "https://images.wsj.net/im-830988/social",
      "publishedAt": "2023-08-08T01:00:03Z",
      "content": "Opinion | Donald Trump’s Last HurrahBy Aug. 7, 2023 6:00 pm ET\r\nReview and Outlook: Special counsel Jack Smith's latest indictment is based on a broad and novel theory of fraud against the U.S. and s… [+1111 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "Spencer Jakab",
      "title": "Stocks for the Short Run",
      "description": "Heard’s columnists bet on a stock that fell 100% and still did pretty well. You can too.",
      "url": "https://www.wsj.com/articles/stocks-for-the-short-run-5bb13ee",
      "urlToImage": "https://images.wsj.net/im-826357/social",
      "publishedAt": "2023-08-07T09:30:00Z",
      "content": "October: This is one of the peculiarly dangerous months to speculate in stocks. The others are July, January, September, April, November, May, March, June, December, August and February.\r\nCopyright ©… [+87 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "Patricia Kowsmann",
      "title": "Stocks to Watch Monday: Berkshire Hathaway, Yellow, KKR",
      "description": "Dow futures rise, pointing to a higher open for stocks Monday",
      "url": "https://www.wsj.com/livecoverage/stock-market-today-dow-jones-08-07-2023",
      "urlToImage": "https://images.wsj.net/im-829033/social",
      "publishedAt": "2023-08-07T08:41:43Z",
      "content": "Berkshire Hathaway (BRK.B, BRK.A): Warren Buffetts conglomerate swung to a second-quarter profit of ${'$'}35.9 billion, boosted by its insurance division and strong gains in its massive investment portfol… [+540 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "3 Men Battle FBI Over Buried Civil War Gold...",
      "description": "Treasure hunters are aiming to prove there were tons of loot in the ground in Pennsylvania—and that the government took it",
      "url": "https://www.wsj.com/articles/civil-war-gold-treasure-hunters-fbi-7533544e",
      "urlToImage": "https://images.wsj.net/im-830036/social",
      "publishedAt": "2023-08-06T13:00:03Z",
      "content": "Three Men Battle the FBI Over Buried Civil War Gold. ‘Stuff Just Doesn’t Add Up.’DENTS RUN, Pa.—Dennis Parada points to a weedy spot where he believes the Federal Bureau of Investigation dug up nine … [+730 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "Jan Wolfe, Jack Gillum, Byron Tau, Andrew Mollica",
      "title": "The Don's Attorneys Reap Windfalls From His Donors...",
      "description": "The Don's Attorneys Reap Windfalls From His Donors...\r\n\n \n \n \n (First column, 4th story, link)\r\n\n \r\n\n \r\n\n \n Related stories:INDICTMENT #4?\r\nHow Trump could walk...\r\nPAPER: Secret Service protection may rule out prison...\r\nDems request live broadcasts of trial…",
      "url": "https://www.wsj.com/articles/trumps-donors-help-fund-his-legal-bills-becoming-windfalls-for-his-attorneys-9b119b1c",
      "urlToImage": "https://images.wsj.net/im-829414/social",
      "publishedAt": "2023-08-05T17:43:37Z",
      "content": "Legal fees paid by Trumps Save America, since 2021\r\nTied to Trump's legal representation in his civil and criminal cases\r\nOther legal fees, including some that appear tied to Trump's aides and associ… [+2219 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "The Wall Street Journal",
      "title": "Is Hip Hop Really 50 Years Old? The Debate Intensifies",
      "description": "In a genre that has always valued volume as much as it loves liberation, the elders still compete over the story’s beats, much as they once battled over musical ones. It is a very hip-hop thing: a history written by the loudest. And loudness is one Herc contr…",
      "url": "https://www.wsj.com/articles/was-hip-hop-really-invented-50-years-ago-1dd40947",
      "urlToImage": "https://images.wsj.net/im-828256/social",
      "publishedAt": "2023-08-04T21:01:00Z",
      "content": "The music world has been gearing up for Aug. 11, which will be widely celebrated as the 50th anniversary of the birth of hip-hop. The story goes like this: On that date in 1973, in the rec room of an… [+507 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "What UFOs Say About Populist Moment...",
      "description": "Americans are increasingly willing to believe reports of alien visitors, raising some familiar questions about science, authority and public trust.",
      "url": "https://www.wsj.com/articles/what-ufos-say-about-our-populist-moment-fda404e2",
      "urlToImage": "https://images.wsj.net/im-828552/social",
      "publishedAt": "2023-08-04T18:00:04Z",
      "content": "Essay | What UFOs Say About Our Populist MomentBy Adam Kirsch Aug. 4, 2023 10:41 am ETNot long before his death in 1996, Carl Sagan said that he had been “captured by the notion of extraterrestrial l… [+1012 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "The Wall Street Journal",
      "title": "The Art Of Conversation – And Why It’s More Difficult Today",
      "description": "“To speak to the converted or the entirely familiar is not to truly converse,. It is to have one’s beliefs reinforced; it is self-soothing but not self-developing.” – The Wall Street Journal",
      "url": "https://www.wsj.com/articles/talking-cure-review-the-joys-of-spirited-conversation-4567781c",
      "urlToImage": "https://images.wsj.net/im-829452/social",
      "publishedAt": "2023-08-04T16:31:00Z",
      "content": "As weve often been told, the art of conversation is on life support, ravaged by the excesses of technology. Hooked to our phones and laptops, or so the theory goes, weve lost the true gift for gab. S… [+398 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "David Marino-Nachison",
      "title": "Nikola Stock Falls as CEO to Step Aside, Sales Drop",
      "description": "Live coverage of what's moving stocks and other markets, including the Dow Jones Industrial Average, S&P 500 and Nasdaq Composite",
      "url": "https://www.wsj.com/livecoverage/stock-market-today-jobs-report-08-04-2023",
      "urlToImage": "https://images.wsj.net/im-829864?width=600",
      "publishedAt": "2023-08-04T13:40:01Z",
      "content": "Shares of electric-vehicle maker Nikola dropped in early trading Friday after the company said its chief executive would step down, to be replaced by its chairman.\r\nNikola stock was recently off more… [+367 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Moscow Again Turning to NKorea to Replenish Ammunition Supplies...",
      "description": "As fighting in Ukraine depletes stockpiles on both sides, Moscow is looking to Pyongyang for help",
      "url": "https://www.wsj.com/articles/russia-is-again-turning-to-north-korea-to-replenish-ammunition-supplies-d79a5318",
      "urlToImage": "https://images.wsj.net/im-829500/social",
      "publishedAt": "2023-08-04T02:00:03Z",
      "content": "Russia Is Again Turning to North Korea to Replenish Ammunition SuppliesBy Aug. 3, 2023 5:49 pm ET\r\nNorth Korean media showed leader Kim Jong Un taking Russian Defense Minister Sergei Shoigu around a … [+932 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Rags-to-Riches Female Candidate Shakes Up Mexico Presidential Race...",
      "description": "Xóchitl Gálvez, who sold tamales as a child, spars with President López Obrador and offers encouragement to a dispirited opposition",
      "url": "https://www.wsj.com/articles/rags-to-riches-female-candidate-shakes-up-mexico-presidential-race-abf1ba86",
      "urlToImage": "https://images.wsj.net/im-828458/social",
      "publishedAt": "2023-08-03T15:00:03Z",
      "content": "Rags-to-Riches Female Candidate Shakes Up Mexico Presidential RaceCUERNAVACA, Mexico—Xóchitl Gálvez, wearing an ankle-length traditional indigenous dress, strode into a packed auditorium to a standin… [+735 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "Dov Lieber",
      "title": "Israeli Reservists Start Missing Duty, Threatening Military Unity and Readiness...",
      "description": "Israeli Reservists Start Missing Duty, Threatening Military Unity and Readiness...\r\n\n \n \n \n (First column, 14th story, link)",
      "url": "https://www.wsj.com/articles/israeli-reservists-start-missing-duty-threatening-military-unity-and-readiness-76df3ade",
      "urlToImage": "https://images.wsj.net/im-828271/social",
      "publishedAt": "2023-08-03T11:22:37Z",
      "content": "TEL AVIVCol. Nissim Yogev spent 25 years as a combat flight navigator in the Israeli Air Force, where he fought in Israels war with Lebanon and saw his best friend go missing in combat, never to retu… [+350 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Mystery Buyer Pays ${'$'}140 Million for Connecticut's Most Expensive Home!",
      "description": "Copper Beech Farm in Greenwich is also one of the priciest properties to close in the U.S.",
      "url": "https://www.wsj.com/articles/mystery-buyer-pays-138-83-million-for-connecticuts-most-expensive-home-4d699afc",
      "urlToImage": "https://images.wsj.net/im-718632/social",
      "publishedAt": "2023-08-03T01:00:03Z",
      "content": "WSJ News Exclusive | Mystery Buyer Pays ${'$'}138.83 Million for Connecticut’s Most Expensive HomeBe the first to know about the biggest and best luxury home sales and listings by signing up for our Mansi… [+702 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Justice Department on Trial, Too...",
      "description": "Latest case will put agency in court, and into the court of public opinion",
      "url": "https://www.wsj.com/articles/trump-is-being-prosecuted-but-the-justice-department-is-on-trial-too-80dce945",
      "urlToImage": "https://images.wsj.net/im-827915/social",
      "publishedAt": "2023-08-02T22:00:03Z",
      "content": "Trump Is Being Prosecuted, but Justice Department Is on Trial, TooBy Updated Aug. 2, 2023 5:30 pm ET\r\nA federal grand jury in Washington has indicted former President Donald Trump in connection with … [+1054 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Why Middle-Aged Americans Not Going Back to Church...",
      "description": "Americans in their 40s and 50s often identify with a religion, but they’re also in the thick of raising kids, caring for aging parents and juggling demanding jobs",
      "url": "https://www.wsj.com/articles/church-attendance-religion-generation-x-6ee5f11d",
      "urlToImage": "https://images.wsj.net/im-827955/social",
      "publishedAt": "2023-08-02T19:00:03Z",
      "content": "Why Middle-Aged Americans Aren’t Going Back to ChurchBy Aug. 1, 2023 9:00 pm ETChurch attendance for Gen Xers has dropped off more dramatically than other age groups.Copyright ©2023 Dow Jones & Compa… [+600 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "August Will Have Two Supermoons, Including Rare Blue Supermoon...",
      "description": "The end of the month will feature the biggest and brightest supermoon of 2023",
      "url": "https://www.wsj.com/articles/are-blue-supermoon-sturgeon-august-2e9fa457",
      "urlToImage": "https://images.wsj.net/im-828294/social",
      "publishedAt": "2023-08-02T16:00:03Z",
      "content": "Two Supermoons Happening in August, Including a Blue MoonBy Updated Aug. 2, 2023 11:33 am ET\r\nA supermoon, which occurs when the moon is full at the moment when its orbit is closest to Earth, appeare… [+877 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Movie-Theater Behavior Has Gone Off the Reels...",
      "description": "Theaters were once a no-phone zone. Now people are using devices without remorse.",
      "url": "https://www.wsj.com/articles/movie-theater-behavior-has-gone-off-the-reels-8d3ba0b",
      "urlToImage": "https://images.wsj.net/im-827399/social",
      "publishedAt": "2023-08-02T14:00:03Z",
      "content": "Movie-Theater Behavior Has Gone Off the ReelsBy Aug. 2, 2023 9:00 am ET\r\nMovie fans flocked to theaters for the release of “Barbie” and “Oppenheimer,” with some seeing the films back-to-back. Hollywo… [+860 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Suspended NFL Player Faces Criminal Probes for Betting On Own Team...",
      "description": "The Denver Broncos’ Eyioma Uwazurike allegedly bet on his own team both in the NFL and in college at Iowa State, where a number of athletes including the starting quarterback have been charged",
      "url": "https://www.wsj.com/sports/football/hunter-dekkers-iowa-state-sports-betting-eyioma-uwazurike-denver-broncos-4b710e3f",
      "urlToImage": "https://images.wsj.net/im-826987/social",
      "publishedAt": "2023-08-02T13:00:04Z",
      "content": "Suspended NFL Player Faces Criminal Probes for Betting On His Own TeamBy and Aug. 2, 2023 8:23 am ETDenver Broncos defensive end Eyioma Uwazurike last week received a low-profile suspension for viola… [+892 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "Gunjan Banerji",
      "title": "Tupperware Stock's Wild Ride Set to Continue",
      "description": "Live updates on what's moving stocks and other markets, including the Dow Jones Industrial Average, S&P 500 and Nasdaq Composite",
      "url": "https://www.wsj.com/livecoverage/stock-market-today-08-02-2023",
      "urlToImage": "https://images.wsj.net/im-828136?width=600",
      "publishedAt": "2023-08-02T12:13:09Z",
      "content": "Tupperware shares are sliding 13% ahead of the opening bell, chipping away at some of the stock's big gains this week.\r\nInvestors have been following the meme playbook for Tupperware stock, doubling … [+382 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "'How Do I Do That?' New Hires Are Unprepared for Work...",
      "description": "Remote learning during the pandemic left students short of basic skills. Now companies are trying to teach them on the job.",
      "url": "https://www.wsj.com/articles/lost-learning-remote-pandemic-workplace-skills-new-employees-51351b33",
      "urlToImage": "https://images.wsj.net/im-827972/social",
      "publishedAt": "2023-08-02T12:00:03Z",
      "content": "‘How Do I Do That?’ The New Hires of 2023 Are Unprepared for WorkRoman Devengenzo was consulting for a robotics company in Silicon Valley last fall when he asked a newly minted mechanical engineer to… [+792 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Indict, Rally, Repeat: Reactions to Charges Follow Familiar Script...",
      "description": "Core Republican voters and key lawmakers again stick by former president, while the 2024 GOP field is divided",
      "url": "https://www.wsj.com/articles/indict-rally-repeat-reactions-to-latest-trump-charges-follow-familiar-script-ba3ffe1",
      "urlToImage": "https://images.wsj.net/im-828035/social",
      "publishedAt": "2023-08-02T12:00:03Z",
      "content": "Indict, Rally, Repeat: Reactions to Latest Trump Charges Follow Familiar ScriptBy and Aug. 2, 2023 6:52 am ET\r\nA federal grand jury in Washington has indicted former President Donald Trump in connect… [+1086 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "FACEBOOK to Block News for Canada...",
      "description": "Facebook parent says the changes—in response to legislation aimed at compensating domestic media—will take weeks to roll out",
      "url": "https://www.wsj.com/articles/meta-platforms-to-begin-blocking-news-for-canadian-users-35d35b2b",
      "urlToImage": "https://images.wsj.net/im-827696/social",
      "publishedAt": "2023-08-01T19:00:03Z",
      "content": "Meta Platforms to Begin Blocking News for Canadian UsersBy Aug. 1, 2023 2:36 pm ET\r\nOTTAWA—After months of warnings, Meta Platforms said Tuesday it has started to block access to news links for Faceb… [+762 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "Gunjan Banerji",
      "title": "Tupperware Stock Skyrockets 24% Ahead of the Opening Bell",
      "description": "Live coverage of what's moving stocks and other markets, including the Dow Jones Industrial Average, S&P 500 and Nasdaq Composite",
      "url": "https://www.wsj.com/livecoverage/stock-market-today-dow-jones-08-01-2023",
      "urlToImage": "https://images.wsj.net/im-827293?width=600",
      "publishedAt": "2023-08-01T12:19:26Z",
      "content": "Shares of Tupperware soared more than 20% ahead of the opening bell, continuing a meteoric rally that has more than quadrupled the value of the stock since the start of July.\r\nThe gains are reminisce… [+529 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "People Hiring D-List Celebs to Deliver Bad News...",
      "description": "Personalized videos from actors aren’t reserved just for happy birthday messages",
      "url": "https://www.wsj.com/articles/cameo-app-hire-celebrities-to-deliver-personal-messages-c2090cce",
      "urlToImage": "https://images.wsj.net/im-826588/social",
      "publishedAt": "2023-07-31T20:00:03Z",
      "content": "People Are Hiring D-List Celebrities to Deliver Their Bad NewsBy July 31, 2023 9:04 am ETThe morning of her wedding, Jessica Van Wagnen was primping in her bridal suite in Scottsville, N.Y., when her… [+707 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Local Malls, Stuck in 'Death Spiral,' Plunge in Value...",
      "description": "Crystal Mall in Connecticut, worth ${'$'}150 million in 2012, recently sold for ${'$'}9.5 million",
      "url": "https://www.wsj.com/articles/local-malls-stuck-in-death-spiral-plunge-in-value-a7998b7d",
      "urlToImage": "https://images.wsj.net/im-823519/social",
      "publishedAt": "2023-07-31T19:00:04Z",
      "content": "Local Malls, Stuck in ‘Death Spiral,’ Plunge in ValueBy July 31, 2023 5:30 am ETWATERFORD, Conn.—Crystal Mall’s parking lots used to be so crowded that parents would line up to drop off their teenage… [+711 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Leave No Pet Behind: Returning U.S. Soldiers, Diplomats Work to Bring Home Furry Friends...",
      "description": "U.S. Navy Seals rescue cats and dogs in elite Sudan operation, the latest in line of war zone animal evacuations",
      "url": "https://www.wsj.com/articles/leave-no-pet-behind-returning-u-s-soldiers-diplomats-work-to-bring-home-furry-friends-be3b6ecc",
      "urlToImage": "https://images.wsj.net/im-825447/social",
      "publishedAt": "2023-07-31T12:00:03Z",
      "content": "Leave No Pet Behind: Returning U.S. Soldiers, Diplomats Work to Bring Home Furry FriendsBy July 30, 2023 9:00 pm ET\r\nWASHINGTON—When U.S. ambassador to Sudan John Godfrey was huddled in Khartoum whil… [+858 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": null,
      "title": "Apple, Amazon, Starbucks to Report in Packed Earnings Week",
      "description": "Live coverage of what's moving stocks and other markets, including the Dow Jones Industrial Average, S&P 500 and Nasdaq Composite",
      "url": "https://www.wsj.com/livecoverage/stock-market-today-dow-jones-07-31-2023",
      "urlToImage": "https://images.wsj.net/im-785590/social",
      "publishedAt": "2023-07-31T07:40:02Z",
      "content": "Apple is set to report earnings Thursday, following mixed reports from other tech companies last week. (Aly Song/Reuters)\r\nApple, Amazon.com and Starbucks will report earnings this week, offering ins… [+493 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "America's Military Trails Rivals in Race for Melting Arctic...",
      "description": "U.S. is competing with a Russian-Chinese partnership for a strategic presence but has fewer icebreakers and ports, and less experience",
      "url": "https://www.wsj.com/articles/americas-military-falls-behind-russia-china-race-for-melting-arctic-2a71dfac",
      "urlToImage": "https://images.wsj.net/im-820190/social",
      "publishedAt": "2023-07-30T13:00:02Z",
      "content": "America’s Military Trails Rivals in Race for the Melting ArcticDUTCH HARBOR, Alaska—On patrol in the Bering Sea last fall, the U.S. Coast Guard Cutter Kimball spotted seven Chinese and Russian vessel… [+757 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "Josh Ulick, Adrienne Tong, Danny Dougherty",
      "title": "Why EVs, Laptops Catching Fire...",
      "description": "Deadly incidents raise safety concerns about batteries used to power electric cars and cellphones",
      "url": "https://www.wsj.com/articles/lithium-ion-batteries-fire-explained-1e5cbe9c",
      "urlToImage": "https://images.wsj.net/im-787462/social",
      "publishedAt": "2023-07-30T11:43:37Z",
      "content": "Thanks to their ability to store large amounts of energy in a small package, lithium-ion batteries have become increasingly popular, powering such devices as laptops and vape pens as well as electric… [+242 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "ALITO: I HAVE TO DEFEND MYSELF...",
      "description": "He has emerged as an important justice with a distinctive interpretive method that is pragmatic yet rooted in originalism and textualism.",
      "url": "https://www.wsj.com/articles/samuel-alito-the-supreme-courts-plain-spoken-defender-precedent-ethics-originalism-5e3e9a7",
      "urlToImage": "https://images.wsj.net/im-825677/social",
      "publishedAt": "2023-07-28T20:00:03Z",
      "content": "Opinion | Samuel Alito, the Supreme Court’s Plain-Spoken DefenderBy David B. Rivkin Jr. and July 28, 2023 1:57 pm ET\r\nNew YorkCopyright ©2023 Dow Jones & Company, Inc. All Rights Reserved. 87990cbe85… [+584 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Inside WALMART Warehouse of Future -- Where Robots Do the Work...",
      "description": "Robots handle many functions at Florida facility, from unloading trucks and scanning boxes to building and shrink-wrapping pallets for delivery",
      "url": "https://www.wsj.com/articles/inside-walmarts-warehouse-of-the-future-6f17d17a",
      "urlToImage": "https://images.wsj.net/im-823553/social",
      "publishedAt": "2023-07-28T14:00:03Z",
      "content": "Inside Walmart’s Warehouse of the FutureBROOKSVILLE, Fla.—Inside a sprawling Walmart warehouse here, hundreds of jobs slinging boxes are changing into roles managing robotic arms, conveyor belts and … [+655 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "Charley Grant",
      "title": "Will Biogen's Deal Splash Give Biotech a Lift?",
      "description": "Live coverage of what's moving stocks and other markets, including the Dow Jones Industrial Average, S&P 500 and Nasdaq Composite",
      "url": "https://www.wsj.com/livecoverage/stock-market-today-dow-jones-07-28-2023",
      "urlToImage": "https://images.wsj.net/im-825640/social",
      "publishedAt": "2023-07-28T12:43:21Z",
      "content": "Its a merger Friday, and that means payday for shareholders of Reata Pharmaceuticals.\r\nShares of Reata, which specializes in developing drugs to treat rare neurologic diseases, are up 51% in premarke… [+353 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Taiwan Amps Up Chinese-Invasion Drills to Deliver Message: War Could Happen...",
      "description": "Military and civilian exercises are larger, louder, better coordinated as government seeks to battle public complacency",
      "url": "https://www.wsj.com/articles/taiwan-amps-up-chinese-invasion-drills-to-deliver-a-message-war-could-happen-705e6343",
      "urlToImage": "https://images.wsj.net/im-825566/social",
      "publishedAt": "2023-07-28T12:00:03Z",
      "content": "Taiwan Amps Up Chinese-Invasion Drills to Deliver a Message: War Could HappenBy Updated July 28, 2023 5:54 am ET\r\nTaiwan’s annual military exercises and civilian drills have expanded dramatically thi… [+1194 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "FACEBOOK Bowed to White House Pressure, Removed Covid Posts...",
      "description": "Internal Meta emails say pressure from Washington was behind a decision to take down posts attributing pandemic to man-made virus",
      "url": "https://www.wsj.com/articles/facebook-bowed-to-white-house-pressure-removed-covid-posts-2df436b7",
      "urlToImage": "https://images.wsj.net/im-825357/social",
      "publishedAt": "2023-07-28T12:00:03Z",
      "content": "WSJ News Exclusive | Facebook Bowed to White House Pressure, Removed Covid PostsBy July 28, 2023 5:30 am ET\r\nTwitter owner Elon Musk and Meta CEO Mark Zuckerberg have agreed to a cage match. A physic… [+1111 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "New Rules Don't Deter Venezuelans...",
      "description": "Illegal crossings are down, but Venezuelan refugees still seek to enter",
      "url": "https://www.wsj.com/articles/bidens-new-border-rules-dont-deter-desperate-venezuelans-9a3c022b",
      "urlToImage": "https://images.wsj.net/im-824234/social",
      "publishedAt": "2023-07-27T20:00:02Z",
      "content": "Biden’s New Border Rules Don’t Deter Desperate VenezuelansNew border-enforcement measures by the Biden administration have decreased illegal crossings, but millions of Venezuelan refugees across Lati… [+708 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Lower Cancer Risk With Just 4 Mins of Exercise...",
      "description": "Short bursts of daily movement were associated with lower cancer incidence in a new study",
      "url": "https://www.wsj.com/articles/even-four-minutes-of-exercise-a-day-could-cut-your-cancer-risk-8768087f",
      "urlToImage": "https://images.wsj.net/im-824815/social",
      "publishedAt": "2023-07-27T19:00:03Z",
      "content": "Lower Your Cancer Risk With Just Four Minutes of ExerciseBy Updated July 27, 2023 2:24 pm ET\r\nTo reduce your cancer risk, you don’t need to make it all the way to the gym: You could start by bringing… [+675 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "First Smart Gun Finally Coming to Market. Will Anyone Buy?",
      "description": "Gun makers have been working for decades on a weapon that can only be fired by an authorized user",
      "url": "https://www.wsj.com/articles/the-first-smart-gun-is-finally-coming-to-market-will-anyone-buy-it-67314e0",
      "urlToImage": "https://images.wsj.net/im-824428/social",
      "publishedAt": "2023-07-27T18:00:03Z",
      "content": "The First Smart Gun Is Finally Coming to Market. Will Anyone Buy It?Sasha Wiesen sleeps with a .40-caliber handgun in a safe by his bed. The commercial real-estate broker from Florida recently preord… [+733 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "Chelsey Dulaney",
      "title": "How the ECB Jolted the Euro With One Word",
      "description": "Live coverage of what's moving stocks and other markets, including the Dow Jones Industrial Average, S&P 500 and Nasdaq Composite",
      "url": "https://www.wsj.com/livecoverage/stock-market-today-dow-jones-07-27-2023",
      "urlToImage": "https://images.wsj.net/im-824879?width=600",
      "publishedAt": "2023-07-27T14:44:39Z",
      "content": "The European Central Banks latest policy statement didnt change very much from Junes. But the absence of one verb from the policy announcement was quickly noticed by investors, sending ripples throug… [+473 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "Patricia Kowsmann",
      "title": "Deutsche Bank Profit Falls 22% on Higher Costs",
      "description": "Federal Reserve is expected to raise interest rates by another quarter-percentage point today",
      "url": "https://www.wsj.com/livecoverage/fed-meeting-interest-rate-decision-today-july-2023",
      "urlToImage": "https://images.wsj.net/im-823829/social",
      "publishedAt": "2023-07-26T07:15:24Z",
      "content": "Deutsche Bank reported a fall in quarterly profit on higher costs. But it will resume share buybacks as revenue continues to rise. Net profit fell 22% to 940 million, or about ${'$'}1 billion, topping con… [+598 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Russian Jet Fighter Damages U.S. Drone...",
      "description": "Confrontation is Russian move to pressure American forces to pull back from the region, U.S. officials say.",
      "url": "https://www.wsj.com/articles/russian-jet-fighter-damages-u-s-drone-over-syria-3be72019",
      "urlToImage": "https://images.wsj.net/im-823198/social",
      "publishedAt": "2023-07-25T14:00:03Z",
      "content": "Russian Jet Fighter Damages U.S. Drone Over SyriaBy Updated July 25, 2023 9:52 am ET\r\nWASHINGTON—A Russian jet fighter damaged a U.S. MQ-9 Reaper drone over Syria by releasing flares close to the Ame… [+681 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Reservists Refuse to Serve...",
      "description": "Country faces growing threat from Iran-backed Hezbollah while ties with Washington are strained",
      "url": "https://www.wsj.com/articles/israels-judicial-overhaul-raises-security-concerns-as-reservists-refuse-to-serve-5d68bfff",
      "urlToImage": "https://images.wsj.net/im-823133/social",
      "publishedAt": "2023-07-25T13:00:03Z",
      "content": "Israel’s Judicial Overhaul Raises Security Concerns as Reservists Refuse to ServeBy and July 25, 2023 8:33 am ET\r\nIsraeli Prime Minister Benjamin Netanyahu’s coalition on Monday passed the first bill… [+1181 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Doctors Go On Strike to Protest...",
      "description": "Political opposition, the Israel Bar Association petition the Supreme Court to strike down the new law",
      "url": "https://www.wsj.com/articles/israeli-doctors-go-on-strike-to-protest-netanyahus-judicial-overhaul-463530e7",
      "urlToImage": "https://images.wsj.net/im-823093/social",
      "publishedAt": "2023-07-25T11:00:03Z",
      "content": "Israeli Doctors Go On Strike to Protest Netanyahu’s Judicial OverhaulBy July 25, 2023 6:20 am ET\r\nIsraeli Prime Minister Benjamin Netanyahu’s coalition on Monday passed the first bill in a contentiou… [+1012 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "Anna Hirtenstein",
      "title": "Stocks to Watch Tuesday: Alphabet, Microsoft, General Electric, AMC",
      "description": "Live coverage of what's moving stocks and other markets, including the Dow Jones Industrial Average, S&P 500 and Nasdaq Composite",
      "url": "https://www.wsj.com/livecoverage/stock-market-today-dow-jones-07-25-2023",
      "urlToImage": "https://images.wsj.net/im-823076/social",
      "publishedAt": "2023-07-25T09:17:37Z",
      "content": "General Electric (GE): The industrial conglomerate is among the companies scheduled to report earnings ahead of the opening bell, along with General Motors (GM), Raytheon (RTX), Verizon (VZ) and Spot… [+475 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "'Barbenheimer' Blowup Is a Flash in the Pan...",
      "description": "Viral double-feature hype is one-off, and Hollywood strikes could hurt year’s remaining releases",
      "url": "https://www.wsj.com/articles/barbenheimer-blow-up-is-a-flash-in-the-pan-for-hollywood-4641dbb9",
      "urlToImage": "https://images.wsj.net/im-822679/social",
      "publishedAt": "2023-07-24T23:00:03Z",
      "content": "‘Barbenheimer’ Blowup Is a Flash in the Pan for HollywoodBy July 24, 2023 10:58 am ET\r\nMovie fans flocked to theaters for the release of ‘Barbie’ and ‘Oppenheimer,’ with some seeing the films back-to… [+835 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Heart Attack Risk Rises Significantly on Extremely Hot, Polluted Days...",
      "description": "Exposure to both high temperatures and air pollution is ‘more than a double whammy,’ study shows",
      "url": "https://www.wsj.com/articles/extreme-heat-air-quality-heart-attack-risk-d3790927",
      "urlToImage": "https://images.wsj.net/im-820750/social",
      "publishedAt": "2023-07-24T23:00:03Z",
      "content": "Heart Attack Risk Rises Significantly on Extremely Hot, Polluted DaysBy July 24, 2023 2:00 pm ET\r\nExtreme heat and air pollution can be dangerous for the heart. Enduring both at the same time can be … [+697 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Hidden Career Cost of Being Overweight...",
      "description": "New moves to outlaw weight discrimination are pushing companies to examine one of the most insidious forms of on-the-job bias",
      "url": "https://www.wsj.com/articles/the-hidden-career-cost-of-being-overweight-68f4b8e7",
      "urlToImage": "https://images.wsj.net/im-821735/social",
      "publishedAt": "2023-07-24T18:00:03Z",
      "content": "The Hidden Career Cost of Being OverweightBy July 24, 2023 9:00 am ET\r\nDiabetes drugs could become an effective way to treat behavioral issues and addiction. WSJ’s Daniela Hernandez breaks down the s… [+1005 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Beijing Money Flees Western World...",
      "description": "Investors who once bought New York City hotels are placing funds elsewhere",
      "url": "https://www.wsj.com/articles/chinese-money-flees-the-western-world-673d9bbb",
      "urlToImage": "https://images.wsj.net/im-821864/social",
      "publishedAt": "2023-07-23T12:00:05Z",
      "content": "Chinese Money Flees the Western WorldBy and July 23, 2023 7:00 am ET\r\nJust a few years ago, Chinese money was rippling across the rich world. Chinese investors were making blockbuster deals and snapp… [+750 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "David Oshinsky",
      "title": "Time to bring back asylums?",
      "description": "Recent cases of violence by the mentally ill highlight the need to reconsider a long-maligned institution that now offers a promising solution.",
      "url": "https://www.wsj.com/articles/its-time-to-bring-back-the-asylum-ec01fb2",
      "urlToImage": "https://images.wsj.net/im-820415/social",
      "publishedAt": "2023-07-22T14:05:12Z",
      "content": "The ongoing saga of the severely mentally ill in America is stirring attention again in a sadly familiar way. In Los Angeles in early 2022, a 70-year-old nurse was murdered while waiting for a bus, a… [+358 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Extreme Heat Strains Air Conditioners...",
      "description": "Longer running times, greater stress on components cause more wear on air-conditioning systems",
      "url": "https://www.wsj.com/articles/extreme-heat-strains-air-conditioning-as-americans-seek-relief-529fd5c8",
      "urlToImage": "https://images.wsj.net/im-821936/social",
      "publishedAt": "2023-07-22T14:00:03Z",
      "content": "Extreme Heat Strains Air Conditioning as Americans Seek ReliefBy July 22, 2023 8:00 am ET\r\nEven air conditioners are struggling to endure record temperatures this summer. Copyright ©2023 Dow Jones & … [+617 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "How Tiny Archipelago Gave Russia Foothold in Atlantic...",
      "description": "A longstanding fishing agreement is crucial to the Faroe Islands’ economy, but it also gives Russian vessels access to the North Atlantic",
      "url": "https://www.wsj.com/articles/how-a-tiny-archipelago-gave-russian-ships-a-foothold-in-the-atlantic-83e9c31d",
      "urlToImage": "https://images.wsj.net/im-821413/social",
      "publishedAt": "2023-07-21T14:00:03Z",
      "content": "How a Tiny Archipelago Gave Russian Ships a Foothold in the AtlanticBy July 21, 2023 8:46 am ET\r\nWhile Europe has worked hard to close security gaps since Russia invaded Ukraine, a tiny island group … [+819 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "Weilun Soon",
      "title": "Stocks to Watch Friday: Tesla, American Express, Intuitive",
      "description": "Live coverage of stocks and financial news, including the S&P 500, Dow Jones Industrial Average, and Nasdaq Composite.",
      "url": "https://www.wsj.com/livecoverage/stock-market-today-dow-jones-07-21-2023",
      "urlToImage": "https://images.wsj.net/im-821389/social",
      "publishedAt": "2023-07-21T11:19:49Z",
      "content": "Tesla (TSLA): The electric-vehicle giant's shares rose 0.9% premarket, putting them on track to recoup a small part of the previous session's losses. A 9.7% pullback Thursday had weighed on broad ind… [+377 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "Gina Heeb",
      "title": "Day 3 of Regional Bank Earnings: Fifth Third, KeyCorp, Truist Report",
      "description": "Live coverage of what's moving stocks and markets, including the Dow Jones Industrial Average, S&P 500 and Nasdaq Composite",
      "url": "https://www.wsj.com/livecoverage/stock-market-today-dow-jones-07-20-2023",
      "urlToImage": "https://images.wsj.net/im-785590/social",
      "publishedAt": "2023-07-20T13:50:07Z",
      "content": "Another round of regional banks are out with second-quarter earnings results.Fifth Third(FITB) said deposits rose around 1% from the previous quarter and 2% from a year earlier.\r\nKeyCorp(KEY) deposit… [+290 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Ailing Pope Hurries to Bolster Progressive Legacy...",
      "description": "The pontiff is moving to frame debates that are likely to outlast his reign",
      "url": "https://www.wsj.com/articles/ailing-pope-francis-hurries-to-bolster-his-progressive-legacy-f91bde43",
      "urlToImage": "https://images.wsj.net/im-819881/social",
      "publishedAt": "2023-07-20T12:00:03Z",
      "content": "Ailing Pope Francis Hurries to Bolster His Progressive LegacyBy July 20, 2023 7:00 am ET\r\nPope Francis waved to well-wishers and reporters from a wheelchair as he left a hospital in Rome following he… [+990 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "WEEKEND: Far Right Looks to Seize on Spanish Election...",
      "description": "Economic angst, an unsolved refugee crisis and the war in Ukraine are boosting far-right nationalists and putting centrists on the defensive",
      "url": "https://www.wsj.com/articles/far-right-looks-to-seize-on-spanish-election-919439b4",
      "urlToImage": "https://images.wsj.net/im-819850/social",
      "publishedAt": "2023-07-20T12:00:03Z",
      "content": "In Europe, Far Right is Gaining Influence. Spain Could Be Next.VALENCIA, Spain—For decades after the death of dictator Francisco Franco, Spain was viewed as largely immune to the appeal of the far ri… [+801 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "This Arkansas Town Could Become Epicenter of Lithium Boom...",
      "description": "Companies such as Exxon Mobil plan to extract lithium from brine water to help power electric vehicles",
      "url": "https://www.wsj.com/articles/this-arkansas-town-could-become-the-epicenter-of-a-u-s-lithium-boom-54ad7306",
      "urlToImage": "https://images.wsj.net/im-819562/social",
      "publishedAt": "2023-07-20T12:00:03Z",
      "content": "WSJ News Exclusive | This Arkansas Town Could Become the Epicenter of a U.S. Lithium BoomMAGNOLIA, Ark.—Slipping a handgun into his belt, the mayor of this small town hopped out of his 1995 Ford pick… [+737 chars]"
    },
    {
      "source": {
        "id": "the-wall-street-journal",
        "name": "The Wall Street Journal"
      },
      "author": "wsj",
      "title": "Political Rise of Ultra-Orthodox Jews Shakes Israel's Sense of Identity...",
      "description": "Fast-growing group of religious conservatives allies with Netanyahu to take on Supreme Court, spawning mass protest movement; mandatory military service emerges as a key issue",
      "url": "https://www.wsj.com/articles/israel-ultra-orthodox-haredim-military-service-supreme-court-of-ultra-orthodox-jews-shakes-israels-sense-of-identity-b3155e01",
      "urlToImage": "https://images.wsj.net/im-816910/social",
      "publishedAt": "2023-07-20T12:00:03Z",
      "content": "The Political Rise of Ultra-Orthodox Jews Shakes Israel’s Sense of IdentityBNEI BRAK, Israel—Since Israel’s founding, mandatory military service for Jewish Israelis has been widely embraced as a unif… [+769 chars]"
    }
  ]
}
"""

val topNewsSimple = """
    {
    "status": "success",
    "totalResults": 1,
    "results": [{
            "article_id": "2ee0952a22a6f2e09ac3112058430b36",
            "title": "Fucoidan Umi No Shizuku nhận \"Huy chương Vàng vì sức khỏe cộng đồng\"",
            "link": "https://soha.vn/fucoidan-umi-no-shizuku-nhan-huy-chuong-vang-vi-suc-khoe-cong-dong-20230920112008233.htm",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": null,
            "content": "\"Giải thưởng là cơ hội thuận lợi để giúp doanh nghiệp chuyển tải thông tin đến người tiêu dùng, tôn vinh các sản phẩm thực phẩm chức năng uy tín, chất lượng, an toàn nhờ đổi mới công nghệ và thiết bị, áp dụng các hệ thống quản lý chất lượng tiên tiến\", PGS.TS Trần Đáng cho biết. Trong buổi lễ vinh danh, đại diện của Công ty TNHH Umi No Shizuku, đơn vị phân phối chính thức sản phẩm Fucoidan Umi No Shizuku tại Việt Nam nhấn mạnh, việc nhận được \"Huy chương Vàng vì sức khỏe cộng đồng\" chính là lời khẳng định cho chất lượng và uy tín của thương hiệu Fucoidan, trong suốt hành trình gần 10 năm có mặt tại thị trường Việt Nam. Đồng thời, giải thưởng cũng là minh chứng cho lời cam kết của công ty, đó là cung cấp cho người tiêu dùng Việt Nam một sản phẩm chất lượng rất cao, giúp bảo vệ sức khỏe và mang lại sự an tâm cho khách hàng. Đại diện Công ty TNHH Umi No Shizuku nhận giải thưởng. Trong các nghiên cứu về y khoa đã chứng minh fucoidan là chuỗi phân tử cao polysaccharide có hoạt tính sinh học cao, mang lại hiệu quả đáng kể cho những người cần nâng cao sức đề kháng, giảm tác hại do hóa trị, xạ trị trong điều trị ung bướu. Cụ thể, theo các tài liệu của Viện Nghiên cứu Fucoidan NPO – Nhận Bản đã chứng minh hợp chất Fucoidan có tác dụng hỗ trợ kích hoạt hệ thống miễn dịch. Theo đó, khi hợp chất fucoidan được đưa vào cơ thể, lưu lại trong đường ruột có thể bị hiểu nhầm thành vật lạ, khiến hệ thống miễn dịch được kích hoạt. Điều này góp phần hỗ trợ làm tăng cường hoạt động của hệ thống miễn dịch, giúp cơ thể khỏe mạnh hơn và chống lại các tác nhân gây ung bướu. Các tài liệu nghiên cứu cũng chỉ ra rằng, hợp chất fucoidan có tỷ lệ rất cao trong 2 loại tảo nâu nổi tiếng của Nhật Bản, là tảo Mozuku và tảo Mekabu ở vùng biển Okinawa. Cụ thể, trong fucoidan chiết xuất từ tảo nâu mozuku có khoảng 60% chất fucose, 24% gốc sulfate - hai thành phần chủ chốt của hợp chất fucoidan. Tương tự, hoạt chất fucoidan từ tảo nâu mekabu chứa 39% sulfate. Nhờ vào những hoạt chất có lợi cho sức khỏe, các nhà nghiên cứu đã chiết xuất thành công hợp chất fucoidan có trong tảo nâu Mozuku và tảo nâu Mekabu, kết hợp với các hoạt chất có lợi cho sức khỏe khác có trong nấm Agaricus của Brazil để tạo ra sản phẩm Fucoidan Umi No Shizuku. Sản phẩm Fucoidan Umi No Shizuku vinh dự nhận \"Huy chương Vàng vì sức khỏe cộng đồng\" Sản phẩm Fucoidan Umi No Shizuku đã được phân phối chính hãng ở 45 quốc gia trên thế giới, kể cả những thị trường khó tính như Nhật Bản, Mỹ, Hàn Quốc, Canada... Dù ở bất kỳ thị trường nào và ngay cả thị trường Việt Nam, sản phẩm Fucoidan Umi No Shizuku đều được nhiều người tiêu dùng đón nhận. Hiện nay, sản phẩm có 3 quy cách đóng gói: dạng bột \"TPBVSK Fucoidan Powder Dietary Supplement UMI NO SHIZUKU\", dạng viên \"TPBVSK Fucoidan Capsule Dietary Supplement UMI NO SHIZUKU\" và dạng nước \"TPBVSK Fucoidan Liquid Dietary Supplement UMI NO SHIZUKU\"; đáp ứng đa dạng nhu cầu, phù hợp với nhiều đối tượng và độ tuổi, tiện dụng khi bảo quản. Tại Việt Nam, Fucoidan Umi No Shizuku được phân phối chính thức bởi Công ty TNHH Umi No Shizuku. Hiện đang có chương trình tặng khách hàng mẫu dùng thử và bộ tài liệu chuyên sâu về Fucoidan miễn phí, số lượng mẫu thử có hạn. Vui lòng liên hệ theo thông tin sau: Văn phòng TPHCM: phòng 3A, tầng 33, tòa nhà tài chính Bitexco, số 2 Hải Triều, phường Bến Nghé, quận 1 - Hotline: 0916 753 108 Văn phòng Hà Nội: phòng 1702, tầng 17, tòa nhà Gelex, số 52 Lê Đại Hành, quận Hai Bà Trưng - Hotline: 0934 0202 10 Website Facebook: Sản phẩm Fucoidan Umi No Shizuku có giấy xác nhận nội dung quảng cáo số: 00526/2019/ATTP - XNQC do Cục An toàn thực phẩm - Bộ Y tế cấp ngày 29/3/2019. Sản phẩm này không phải là thuốc, không có tác dụng thay thế thuốc chữa bệnh.",
            "pubDate": "2023-09-20 06:30:00",
            "image_url": null,
            "source_id": "soha",
            "source_priority": 56526,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        }],
    "nextPage": "1695128400519764786"
}
""".trimIndent()

val topNewsData = """
    {
    "status": "success",
    "totalResults": 666,
    "results": [
        
        {
            "article_id": "2ee0952a22a6f2e09ac3112058430b36",
            "title": "Fucoidan Umi No Shizuku nhận \"Huy chương Vàng vì sức khỏe cộng đồng\"",
            "link": "https://soha.vn/fucoidan-umi-no-shizuku-nhan-huy-chuong-vang-vi-suc-khoe-cong-dong-20230920112008233.htm",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": null,
            "content": "\"Giải thưởng là cơ hội thuận lợi để giúp doanh nghiệp chuyển tải thông tin đến người tiêu dùng, tôn vinh các sản phẩm thực phẩm chức năng uy tín, chất lượng, an toàn nhờ đổi mới công nghệ và thiết bị, áp dụng các hệ thống quản lý chất lượng tiên tiến\", PGS.TS Trần Đáng cho biết. Trong buổi lễ vinh danh, đại diện của Công ty TNHH Umi No Shizuku, đơn vị phân phối chính thức sản phẩm Fucoidan Umi No Shizuku tại Việt Nam nhấn mạnh, việc nhận được \"Huy chương Vàng vì sức khỏe cộng đồng\" chính là lời khẳng định cho chất lượng và uy tín của thương hiệu Fucoidan, trong suốt hành trình gần 10 năm có mặt tại thị trường Việt Nam. Đồng thời, giải thưởng cũng là minh chứng cho lời cam kết của công ty, đó là cung cấp cho người tiêu dùng Việt Nam một sản phẩm chất lượng rất cao, giúp bảo vệ sức khỏe và mang lại sự an tâm cho khách hàng. Đại diện Công ty TNHH Umi No Shizuku nhận giải thưởng. Trong các nghiên cứu về y khoa đã chứng minh fucoidan là chuỗi phân tử cao polysaccharide có hoạt tính sinh học cao, mang lại hiệu quả đáng kể cho những người cần nâng cao sức đề kháng, giảm tác hại do hóa trị, xạ trị trong điều trị ung bướu. Cụ thể, theo các tài liệu của Viện Nghiên cứu Fucoidan NPO – Nhận Bản đã chứng minh hợp chất Fucoidan có tác dụng hỗ trợ kích hoạt hệ thống miễn dịch. Theo đó, khi hợp chất fucoidan được đưa vào cơ thể, lưu lại trong đường ruột có thể bị hiểu nhầm thành vật lạ, khiến hệ thống miễn dịch được kích hoạt. Điều này góp phần hỗ trợ làm tăng cường hoạt động của hệ thống miễn dịch, giúp cơ thể khỏe mạnh hơn và chống lại các tác nhân gây ung bướu. Các tài liệu nghiên cứu cũng chỉ ra rằng, hợp chất fucoidan có tỷ lệ rất cao trong 2 loại tảo nâu nổi tiếng của Nhật Bản, là tảo Mozuku và tảo Mekabu ở vùng biển Okinawa. Cụ thể, trong fucoidan chiết xuất từ tảo nâu mozuku có khoảng 60% chất fucose, 24% gốc sulfate - hai thành phần chủ chốt của hợp chất fucoidan. Tương tự, hoạt chất fucoidan từ tảo nâu mekabu chứa 39% sulfate. Nhờ vào những hoạt chất có lợi cho sức khỏe, các nhà nghiên cứu đã chiết xuất thành công hợp chất fucoidan có trong tảo nâu Mozuku và tảo nâu Mekabu, kết hợp với các hoạt chất có lợi cho sức khỏe khác có trong nấm Agaricus của Brazil để tạo ra sản phẩm Fucoidan Umi No Shizuku. Sản phẩm Fucoidan Umi No Shizuku vinh dự nhận \"Huy chương Vàng vì sức khỏe cộng đồng\" Sản phẩm Fucoidan Umi No Shizuku đã được phân phối chính hãng ở 45 quốc gia trên thế giới, kể cả những thị trường khó tính như Nhật Bản, Mỹ, Hàn Quốc, Canada... Dù ở bất kỳ thị trường nào và ngay cả thị trường Việt Nam, sản phẩm Fucoidan Umi No Shizuku đều được nhiều người tiêu dùng đón nhận. Hiện nay, sản phẩm có 3 quy cách đóng gói: dạng bột \"TPBVSK Fucoidan Powder Dietary Supplement UMI NO SHIZUKU\", dạng viên \"TPBVSK Fucoidan Capsule Dietary Supplement UMI NO SHIZUKU\" và dạng nước \"TPBVSK Fucoidan Liquid Dietary Supplement UMI NO SHIZUKU\"; đáp ứng đa dạng nhu cầu, phù hợp với nhiều đối tượng và độ tuổi, tiện dụng khi bảo quản. Tại Việt Nam, Fucoidan Umi No Shizuku được phân phối chính thức bởi Công ty TNHH Umi No Shizuku. Hiện đang có chương trình tặng khách hàng mẫu dùng thử và bộ tài liệu chuyên sâu về Fucoidan miễn phí, số lượng mẫu thử có hạn. Vui lòng liên hệ theo thông tin sau: Văn phòng TPHCM: phòng 3A, tầng 33, tòa nhà tài chính Bitexco, số 2 Hải Triều, phường Bến Nghé, quận 1 - Hotline: 0916 753 108 Văn phòng Hà Nội: phòng 1702, tầng 17, tòa nhà Gelex, số 52 Lê Đại Hành, quận Hai Bà Trưng - Hotline: 0934 0202 10 Website Facebook: Sản phẩm Fucoidan Umi No Shizuku có giấy xác nhận nội dung quảng cáo số: 00526/2019/ATTP - XNQC do Cục An toàn thực phẩm - Bộ Y tế cấp ngày 29/3/2019. Sản phẩm này không phải là thuốc, không có tác dụng thay thế thuốc chữa bệnh.",
            "pubDate": "2023-09-20 06:30:00",
            "image_url": null,
            "source_id": "soha",
            "source_priority": 56526,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "a7076fc29d0333c7e0b6afe44d79651b",
            "title": "Lý do Công ty VN Đà Thành xin tạm dừng cưỡng chế thuế",
            "link": "https://nld.com.vn/kinh-te/ly-do-cong-ty-vn-da-thanh-xin-tam-dung-cuong-che-thue-20230920102013764.htm",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "(NLĐO) - Công ty VN Đà Thành cho biết đang tích cực làm việc với tỉnh Quảng Nam liên quan đến nghĩa vụ tài chính dự án Khu dân cư Thống Nhất để làm cơ sở hoàn trả lại tiền mà công ty đã nộp thừa",
            "content": "Ngày 20-9, Văn phòng UBND tỉnh Quảng Nam cho biết vừa có công văn gửi Cục Thuế tỉnh đề nghị nghiên cứu kiến nghị của Công ty CP Tập đoàn VN Đà Thành (đóng tại Đà Nẵng) về việc tạm dừng cưỡng chế thuế. Phối cảnh dự án Khu dân ca Thống Nhất do Công ty VN Đà Thành làm chủ đầu tư Theo nội dung công văn, sau khi xem xét đề nghị của Công ty VN Đà Thành, ông Nguyễn Hồng Quang, Phó Chủ tịch UBND tỉnh Quảng Nam, nêu ý kiến: trong thời gian chờ các ngành tham mưu điều chỉnh mức thu tiền sử dụng đất dự án Khu dân cư Thống Nhất (phường Điện Dương, thị xã Điện Bàn) để công ty thực hiện nghĩa vụ tài chính theo đúng quy định, UBND tỉnh Quảng Nam đề nghị Cục Thuế tỉnh nghiên cứu kiến nghị của công ty để xem xét tháo gỡ khó khăn cho doanh nghiệp theo thẩm quyền. Trước đó, Công ty VN Đà Thành có văn bản cho biết ngày 25-8, Cục Thuế tỉnh Quảng Nam phát đi 4 công văn \"về việc cưỡng chế thi hành quyết định hành chính về thuế bằng biện pháp phong tỏa tài khoản của đối tượng bị cưỡng chế tại tổ chức tín dụng\". Công ty VN Đà Thành cho biết doanh nghiệp đang tích cực làm việc với UBND tỉnh Quảng Nam, Sở Tài chính, Sở Tài nguyên và môi trường liên quan đến nghĩa vụ tài chính dự án Khu dân cư Thống Nhất (quyết toán, điều chỉnh lại quyết định tiền sử dụng đất) để làm cơ sở hoàn trả lại tiền mà công ty đã nộp thừa. Căn cứ vào đó, công ty sẽ xác định nghĩa vụ tài chính còn lại đối với ngân sách nhà nước. Công ty VN Đà Thành cũng thông tin về các công việc đang triển khai đồng thời đề nghị tạm dừng thực hiện biện pháp thi hành cưỡng chế thuế bằng biện pháp phong tỏa tài khoản đối với công ty trong thời gian thực hiện các thủ tục. Doanh nghiệp trên cam kết sẽ thực hiện đầy đủ nghĩa vụ tài chính với ngân sách nhà nước sau khi có quyết định điều chỉnh tiền sử dụng đất và nhận lại tiền công ty đã nộp thừa theo quy định.",
            "pubDate": "2023-09-20 03:51:03",
            "image_url": null,
            "source_id": "nld",
            "source_priority": 75571,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "3a52b463d2b063bec4e48c81611a2ff2",
            "title": "Rút ngắn thao tác thanh toán di động",
            "link": "https://nld.com.vn/cong-nghe/rut-ngan-thao-tac-thanh-toan-di-dong-20230919211444033.htm",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Vừa qua, Techcombank và Nam A Bank là 2 ngân hàng đầu tiên đã liên kết với Zalo để xây dựng Deeplink (liên kết sâu), giúp người dùng rút gọn thao tác chuyển khoản nhưng vẫn bảo đảm, tuân thủ tính bảo mật, an toàn. Mô hình này được phát triển nhờ sự hỗ trợ của AI.",
            "content": null,
            "pubDate": "2023-09-19 20:15:25",
            "image_url": null,
            "source_id": "nld",
            "source_priority": 75571,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "4c8a35d07ec7003b9654d509f290781f",
            "title": "Ra mắt Không gian Văn hóa Hồ Chí Minh tại Cung Văn hóa Lao động",
            "link": "https://nld.com.vn/cong-doan/ra-mat-khong-gian-van-hoa-ho-chi-minh-tai-cung-van-hoa-lao-dong-20230919204751371.htm",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Sáng 19-9, tại Cung Văn hóa Lao động TP HCM, LĐLĐ thành phố đã khai mạc triển lãm \"Công đoàn TP HCM - Niềm tin của người lao động (NLĐ)\".",
            "content": null,
            "pubDate": "2023-09-19 20:15:25",
            "image_url": null,
            "source_id": "nld",
            "source_priority": 75571,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "af7ccef499e19ea9c30c1d76cc4a937b",
            "title": "Kevinlli - Chất liệu vải may vest cao cấp cho quý ông tự tin và sang trọng",
            "link": "https://nld.com.vn/lam-dep/kevinlli-chat-lieu-vai-may-vest-cao-cap-cho-quy-ong-tu-tin-va-sang-trong-2023091810281325.htm",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Khi nói đến thương hiệu vải may vest cao cấp, không thể không nhắc đến Kevinlli - một thương hiệu mang lại sự tự tin và sang trọng cho quý ông.",
            "content": null,
            "pubDate": "2023-09-19 20:15:25",
            "image_url": null,
            "source_id": "nld",
            "source_priority": 75571,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "55bf9600c9352c2f047b3dd654a59dbb",
            "title": "Tỉ giá USD/VNĐ lại tăng nóng",
            "link": "https://nld.com.vn/kinh-te/ti-gia-usd-vnd-lai-tang-nong-20230919212141911.htm",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Ngày 19-9, tỉ giá trung tâm được Ngân hàng Nhà nước (NHNN) niêm yết ở mức 24.060 đồng/USD, tăng 14 đồng/USD so với hôm trước.",
            "content": null,
            "pubDate": "2023-09-19 20:15:25",
            "image_url": null,
            "source_id": "nld",
            "source_priority": 75571,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "852493c32e46a28401ba6d283926b9dc",
            "title": "Đề nghị xem xét xử lý kỷ luật 44 quân nhân",
            "link": "https://nld.com.vn/thoi-su/de-nghi-xem-xet-xu-ly-ky-luat-44-quan-nhan-20230919211249512.htm",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "(NLĐO) - Ủy ban Kiểm tra Quân ủy Trung ương đề nghị Thường vụ Quân ủy Trung ương, Bộ Quốc phòng xem xét xử lý kỷ luật đối với 12 tập thể và 44 cá nhân",
            "content": null,
            "pubDate": "2023-09-19 20:15:25",
            "image_url": null,
            "source_id": "nld",
            "source_priority": 75571,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "3a3a72609c7e2b2fb4f817eafa79dfb3",
            "title": "Văn Quyết khẳng định Hà Nội FC không e ngại Pohang Steelers",
            "link": "https://nld.com.vn/the-thao/van-quyet-khang-dinh-ha-noi-fc-khong-e-ngai-pohang-steelers-20230919211926473.htm",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "(NLĐO) - Phát biểu trong cuộc họp báo trước lượt trận ra quân AFC Champions League 2023-2024, đội trưởng Hà Nội FC Nguyễn Văn Quyết quyết tâm cùng toàn đội cố gắng thi tốt và không để thua trên sân nhà",
            "content": null,
            "pubDate": "2023-09-19 20:15:25",
            "image_url": null,
            "source_id": "nld",
            "source_priority": 75571,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "cb04a1a7df63c558af746c03b401f1f6",
            "title": "Nỗ lực \"giải cứu\" các mục tiêu tăng trưởng bền vững",
            "link": "https://nld.com.vn/thoi-su-quoc-te/no-luc-giai-cuu-cac-muc-tieu-tang-truong-ben-vung-20230919210205213.htm",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Phát biểu tại Hội nghị Thượng đỉnh về các Mục tiêu phát triển bền vững (SDG) diễn ra ở TP New York - Mỹ trong hai ngày 18 và 19-9, Tổng Thư ký Liên Hiệp Quốc (LHQ) Antonio Guterres khẳng định giờ là lúc thực hiện kế hoạch toàn cầu nhằm \"giải cứu\" các SDG đang đi chệch hướng khi hạn chót năm 2030 đang đến gần.",
            "content": null,
            "pubDate": "2023-09-19 20:15:25",
            "image_url": null,
            "source_id": "nld",
            "source_priority": 75571,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "9494028eb90a59040ca2e90101122a00",
            "title": "Bắt giam kẻ đánh đập dã man, bắt thiếu nữ ăn thằn lằn sống",
            "link": "https://nld.com.vn/phap-luat/bat-giam-ke-danh-dap-da-man-bat-thieu-nu-an-than-lan-song-2023091921173802.htm",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "(NLĐO) – Làm việc với công an, Lê Thị Kiểu đã thừa nhận nhiều lần đánh đập thiếu nữ 16 tuổi, bắt cô phải ăn thằn lằn sống, ngậm băng vệ sinh…",
            "content": null,
            "pubDate": "2023-09-19 20:15:25",
            "image_url": null,
            "source_id": "nld",
            "source_priority": 75571,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "fdc2d594e7a46d4450f720131d9ca9c2",
            "title": "TP HCM: Xây dựng chiến lược hướng tới phát thải ròng bằng 0",
            "link": "https://nld.com.vn/thoi-su/tp-hcm-xay-dung-chien-luoc-huong-toi-phat-thai-rong-bang-0-20230919213426538.htm",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Sở Tài nguyên và Môi trường TP HCM phối hợp USAID (Cơ quan Phát triển quốc tế Mỹ) sáng 19-9 tổ chức hội thảo xây dựng kế hoạch hành động cho TP HCM hướng tới mục tiêu phát thải ròng bằng 0.",
            "content": null,
            "pubDate": "2023-09-19 20:15:25",
            "image_url": null,
            "source_id": "nld",
            "source_priority": 75571,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "a1780539c0b2b1e06b6e868f1aec580d",
            "title": "TP HCM: Tổ chức liên hoan phim ngắn",
            "link": "https://nld.com.vn/van-nghe/tp-hcm-to-chuc-lien-hoan-phim-ngan-20230919212538752.htm",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Liên hoan Phim (LHP) ngắn TP HCM lần thứ nhất - năm 2023 do Hội Điện ảnh TP HCM phối hợp Sở Văn hóa và Thể thao, Đài Truyền hình TP HCM thực hiện, sẽ diễn ra từ ngày 27 đến 30-10.",
            "content": null,
            "pubDate": "2023-09-19 20:15:25",
            "image_url": null,
            "source_id": "nld",
            "source_priority": 75571,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "a1b043dd0a941893df6831f41c31b874",
            "title": "Cách chăm sóc da sau thủ thuật laser",
            "link": "https://vnexpress.net/cach-cham-soc-da-sau-thu-thuat-laser-4652594.html",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Bảo vệ da khỏi ánh nắng mặt trời, bổ sung dinh dưỡng cho da, sử dụng mỹ phẩm đúng cách, tuân thủ hướng dẫn và lịch hẹn tái khám của bác sĩ da liễu.",
            "content": null,
            "pubDate": "2023-09-19 17:05:00",
            "image_url": null,
            "source_id": "vnexpress",
            "source_priority": 4822,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "20bc64cf09e8907efc0e51ffe4fe2077",
            "title": "Hàng chục cá sấu há miệng chờ ăn",
            "link": "https://vnexpress.net/hang-chuc-ca-sau-ha-mieng-cho-an-4654982.html",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Những con cá sấu tập trung lại và há miệng sẵn chờ đến lượt ăn.",
            "content": null,
            "pubDate": "2023-09-19 17:04:00",
            "image_url": null,
            "source_id": "vnexpress",
            "source_priority": 4822,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "0b6d6a444bfb4729a757acd85d400841",
            "title": "Người có mắt diều hâu mới thấy con chim potoo ở đâu?",
            "link": "https://vnexpress.net/nguoi-co-mat-dieu-hau-moi-thay-con-chim-potoo-o-dau-4654391.html",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Mặc dù hành trình tìm kiếm nó khá khó khăn do lá và bụi cây, nhưng những người có đôi mắt tinh tường vẫn có thể xoay sở được.",
            "content": null,
            "pubDate": "2023-09-19 17:02:00",
            "image_url": null,
            "source_id": "vnexpress",
            "source_priority": 4822,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "82daa271019a6cfd6e0190e7569fe109",
            "title": "Hình bạn thấy đầu tiên tiết lộ bạn có phải là người giữ lời hứa?",
            "link": "https://vnexpress.net/hinh-ban-thay-dau-tien-tiet-lo-ban-co-phai-la-nguoi-giu-loi-hua-4654561.html",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Khi nhìn vào tranh, mắt bạn sẽ bị thu hút bởi chi tiết đầu tiên đập vào mắt và điều này có thể cho bạn biết rất nhiều điều.",
            "content": null,
            "pubDate": "2023-09-19 17:01:00",
            "image_url": null,
            "source_id": "vnexpress",
            "source_priority": 4822,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "f72e2a60ae522f80ce12bf6bed2ea0eb",
            "title": "Đời bi kịch của giai nhân huyền thoại Thượng Hải",
            "link": "https://vnexpress.net/doi-bi-kich-cua-giai-nhan-huyen-thoai-thuong-hai-4654743.html",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Nguyễn Linh Ngọc - biểu tượng màn bạc Trung Quốc - qua đời ở tuổi 25 khi nhận ra cô chỉ là \"món đồ chơi\" của người yêu.",
            "content": null,
            "pubDate": "2023-09-19 17:00:00",
            "image_url": null,
            "source_id": "vnexpress",
            "source_priority": 4822,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "5659359c803a3a1697a8ed30e9d1cdca",
            "title": "Mong em ít sống ảo và đừng vô cảm",
            "link": "https://vnexpress.net/mong-em-it-song-ao-va-dung-vo-cam-4654843.html",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Anh tuổi Đinh Mão, độc thân và chưa từng kết hôn, đang ở Dĩ An, Bình Dương.",
            "content": null,
            "pubDate": "2023-09-19 17:00:00",
            "image_url": null,
            "source_id": "vnexpress",
            "source_priority": 4822,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "efa7f188b0a3cc27c33a778289011f9e",
            "title": "Thường xuyên mơ về người yêu cũ",
            "link": "https://vnexpress.net/thuong-xuyen-mo-ve-nguoi-yeu-cu-4655046.html",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Chẳng hiểu sao tôi không nghĩ quá nhiều tới người cũ, cũng không tìm hiểu thông tin về anh nhưng lại hay mơ về anh.",
            "content": null,
            "pubDate": "2023-09-19 17:00:00",
            "image_url": null,
            "source_id": "vnexpress",
            "source_priority": 4822,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "3eadc5afc32e679371339dfd0f6b7f83",
            "title": "Kipchoge sẵn sàng chinh phục Berlin Marathon 2023",
            "link": "https://vnexpress.net/kipchoge-san-sang-chinh-phuc-berlin-marathon-2023-4655068.html",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Runner Kenya Eliud Kipchoge tự tin được chuẩn bị đủ tốt để đón nhận thách thức tại Berlin Marathon - nơi anh tự phá kỷ lục thế giới năm ngoái - vào ngày 24/9.",
            "content": null,
            "pubDate": "2023-09-19 17:00:00",
            "image_url": null,
            "source_id": "vnexpress",
            "source_priority": 4822,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "b042479511de7b2febed924e84bc1f36",
            "title": "Muốn xanh nhưng 'nghĩ nâu'",
            "link": "https://vnexpress.net/muon-xanh-nhung-nghi-nau-4654153.html",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Tại Diễn đàn Kinh tế TP HCM (HEF) năm 2023 với chủ đề “Tăng trưởng xanh - Hành trình hướng tới giảm phát thải ròng bằng không”, diễn ra ngày 15/9 tại TP HCM, tôi nhận ra một vấn đề: chúng ta đang cam kết, đặt ra mục tiêu và nhiều đầu bài, nhưng hành động chưa theo kịp.",
            "content": null,
            "pubDate": "2023-09-19 17:00:00",
            "image_url": null,
            "source_id": "vnexpress",
            "source_priority": 4822,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "02d7ad522d1dff2b4c227cd7752648ff",
            "title": "Chọn ngành Tài chính ngân hàng hay Toán kinh tế?",
            "link": "https://vnexpress.net/chon-nganh-tai-chinh-ngan-hang-hay-toan-kinh-te-4652876.html",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Em phân vân giữa học ngành Tài chính ngân hàng để làm phân tích tài chính hoặc học Toán kinh tế để làm quản trị rủi ro.",
            "content": null,
            "pubDate": "2023-09-19 16:59:00",
            "image_url": null,
            "source_id": "vnexpress",
            "source_priority": 4822,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "ddcd76f583b3c5dfcc6dd605c80131f5",
            "title": "Nấu ăn sáng tại nhà, gia đình tôi tiết kiệm 1,8 triệu đồng mỗi tháng",
            "link": "https://vnexpress.net/nau-an-sang-tai-nha-gia-dinh-toi-tiet-kiem-1-8-trieu-dong-moi-thang-4655030.html",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Tại sao không bỏ ra 30 phút mỗi sáng để con tôi có đồ ăn tốt hơn cho sức khỏe và tiết kiệm tiền bạc?",
            "content": null,
            "pubDate": "2023-09-19 15:00:00",
            "image_url": null,
            "source_id": "vnexpress",
            "source_priority": 4822,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "db449f2278198b20b3f7853ac63e73fc",
            "title": "Báo quốc tế gợi ý tất tần tật những điều nên làm khi ghé thăm Hội An (Việt Nam)",
            "link": "https://kenh14.vn/bao-quoc-te-goi-y-tat-tan-tat-nhung-dieu-nen-lam-khi-ghe-tham-hoi-an-viet-nam-20230919150418849.chn",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Trang Outlook Traveller đưa ra gợi ý về những điều thú vị khi khám phá phố cổ Hội An (Việt Nam).",
            "content": null,
            "pubDate": "2023-09-19 14:19:06",
            "image_url": null,
            "source_id": "kenh14",
            "source_priority": 19897,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "b947c345acf187819feb9a10f6f77569",
            "title": "Hoa hậu Đỗ Mỹ Linh lộ diện bên Phương Oanh và hội bạn thân, nhan sắc mẹ bỉm nổi bần bật",
            "link": "https://kenh14.vn/hoa-hau-do-my-linh-lo-dien-ben-phuong-oanh-va-hoi-ban-than-nhan-sac-me-bim-noi-ban-bat-20230919150648936.chn",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Sau khi sinh con gái đầu lòng, Hoa hậu Đỗ Mỹ Linh hiếm khi xuất hiện trên mạng xã hội.",
            "content": null,
            "pubDate": "2023-09-19 14:12:18",
            "image_url": null,
            "source_id": "kenh14",
            "source_priority": 19897,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "3b24320e46d2bcb0de5fe8f538b9b065",
            "title": "6 loại rau củ bệnh tiểu đường “sợ” nhất, muốn phòng nên ăn thường xuyên",
            "link": "https://kenh14.vn/6-loai-rau-cu-benh-tieu-duong-so-nhat-muon-phong-nen-an-thuong-xuyen-20230919193600761.chn",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Trong tự nhiên cũng có những loại “thuốc hạ đường huyết” mà ít người biết tới. Nếu biết tận dụng, nhiều loại rau củ có thể giúp phòng và kiểm soát bệnh tiểu đường hiệu quả.",
            "content": null,
            "pubDate": "2023-09-19 14:05:00",
            "image_url": null,
            "source_id": "kenh14",
            "source_priority": 19897,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "01165d7d6e12ca9c024d0276db7268f2",
            "title": "Cặp đôi có độ hot tăng hơn 400% thống trị màn ảnh: Nam chính là \"tổng tài\" chị em một thời mê mẩn",
            "link": "https://kenh14.vn/cap-doi-co-do-hot-tang-hon-400-thong-tri-man-anh-nam-chinh-la-tong-tai-chi-em-mot-thoi-me-man-20230919174805022.chn",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Phim này vượt mặt cả Vân Chi Vũ để đứng hạng 1 dù chỉ mới lên sóng.",
            "content": null,
            "pubDate": "2023-09-19 14:00:20",
            "image_url": null,
            "source_id": "kenh14",
            "source_priority": 19897,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "279ba10a039e00bef8e34318f123689c",
            "title": "Bị tổn thương từ nhỏ khiến cuộc đời tôi u ám",
            "link": "https://vnexpress.net/bi-ton-thuong-tu-nho-khien-cuoc-doi-toi-u-am-4649533.html",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Tôi sinh ra trong gia đình thiếu tình thương, tuổi thơ gắn với những kỷ niệm buồn, đau khổ của một gia đình không mấy hạnh phúc.",
            "content": null,
            "pubDate": "2023-09-19 14:00:00",
            "image_url": null,
            "source_id": "vnexpress",
            "source_priority": 4822,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "af020fed89b9627c992bb56985e71c99",
            "title": "Anh hy vọng mùa đông năm nay mình không lạnh",
            "link": "https://vnexpress.net/anh-hy-vong-mua-dong-nam-nay-minh-khong-lanh-4654841.html",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Mong em độc thân, chưa từng kết hôn, chưa có con, làm ở Hà Nội, dễ nhìn một chút để chúng ta có nhiều điểm tương đồng.",
            "content": null,
            "pubDate": "2023-09-19 14:00:00",
            "image_url": null,
            "source_id": "vnexpress",
            "source_priority": 4822,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "2ee6701436de044eade441b4abb00de1",
            "title": "Người Libya đào mộ tập thể chôn nạn nhân lũ quét",
            "link": "https://vnexpress.net/nguoi-libya-dao-mo-tap-the-chon-nan-nhan-lu-quet-4654976.html",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Người dân Derna xây mộ tập thể ở nghĩa trang thành phố, khi số người thiệt mạng sau trận lũ quét không ngừng tăng lên.",
            "content": null,
            "pubDate": "2023-09-19 14:00:00",
            "image_url": null,
            "source_id": "vnexpress",
            "source_priority": 4822,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "9fceae66d0fff215fe01f07b829a3140",
            "title": "Xa Thi Mạn trẻ lâu nhờ tập luyện một bộ môn",
            "link": "https://kenh14.vn/xa-thi-man-tre-lau-nho-tap-luyen-mot-bo-mon-20230919170719233.chn",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Xa Thi Mạn chia sẻ, trong quá trình tập luyện bộ môn này, cô nhận thấy cơ thể được đào thải độc tố rất hiệu quả qua mồ hôi, khí huyết được lưu thông.",
            "content": null,
            "pubDate": "2023-09-19 14:00:00",
            "image_url": null,
            "source_id": "kenh14",
            "source_priority": 19897,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "2aff846384ede087b2356ca8a19af275",
            "title": "Tiên lượng sống của người bệnh ung thư đại trực tràng",
            "link": "https://vnexpress.net/tien-luong-song-cua-nguoi-benh-ung-thu-dai-truc-trang-4655065.html",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Tỷ lệ sống sau 5 năm chung cho các giai đoạn ung thư đại trực tràng là 65%, giai đoạn đầu hơn 90%, giảm xuống khoảng 15% nếu khối u di căn.",
            "content": null,
            "pubDate": "2023-09-19 14:00:00",
            "image_url": null,
            "source_id": "vnexpress",
            "source_priority": 4822,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "01918d76533d387055dc7d8b7b4ccc70",
            "title": "Dia1 tiết lộ bất ngờ về GAM và HLV Ren, khẳng định chắc nịch có thể khiến \"VCS nát\"",
            "link": "https://kenh14.vn/dia1-tiet-lo-bat-ngo-ve-gam-va-hlv-ren-khang-dinh-chac-nich-co-the-khien-vcs-nat-20230919204603261.chn",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Dia1 có những phát biểu gây sốc trong ngày đầu quay lại stream sau thời gian dài.",
            "content": null,
            "pubDate": "2023-09-19 13:45:00",
            "image_url": null,
            "source_id": "kenh14",
            "source_priority": 19897,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "57cf60413d5388ed2c9ae4e78d9d3e14",
            "title": "Con trai MC Thảo Vân trở thành tân sinh viên, ngoại hình bảnh bao tuổi 18 gây chú ý",
            "link": "https://kenh14.vn/con-trai-mc-thao-van-tro-thanh-tan-sinh-vien-ngoai-hinh-banh-bao-tuoi-18-gay-chu-y-20230919183056727.chn",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Mới đây, MC Thảo Vân đã chia sẻ lại khoảnh khắc khai giảng đầu tiên ở bậc đại học của con trai.",
            "content": null,
            "pubDate": "2023-09-19 13:30:00",
            "image_url": null,
            "source_id": "kenh14",
            "source_priority": 19897,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "40bfc1b50e88cc2bb77ae40b1ca2e3fe",
            "title": "Tình trạng hợp đồng của Lisa (BLACKPINK) gây tác động không ngờ: Cổ phiếu YG tụt dốc, nhà đầu tư \"ngồi trên đống lửa\"",
            "link": "https://kenh14.vn/tinh-trang-hop-dong-cua-lisa-blackpink-gay-tac-dong-khong-ngo-co-phieu-yg-tut-doc-nha-dau-tu-ngoi-tren-dong-lua-20230919180750129.chn",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Lisa (BLACKPINK) và YG Entertainment được cho là không đạt được thỏa thuận về hợp đồng mới.",
            "content": null,
            "pubDate": "2023-09-19 13:30:00",
            "image_url": null,
            "source_id": "kenh14",
            "source_priority": 19897,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "1bed59418d07311c5d19ea2a7a30e6ac",
            "title": "Mưa lớn kéo dài khiến đường phố TPHCM ngập nghiêm trọng, nhiều xe chết máy",
            "link": "https://kenh14.vn/mua-lon-keo-dai-khien-duong-pho-tphcm-ngap-nghiem-trong-nhieu-xe-chet-may-20230919202230293.chn",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Cơn mưa kéo dài vào chiều ngày 19/9 khiến nhiều tuyến đường tại TPHCM rơi vào tình trạng ngập lụt nghiêm trọng.",
            "content": null,
            "pubDate": "2023-09-19 13:23:17",
            "image_url": null,
            "source_id": "kenh14",
            "source_priority": 19897,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "abbd5585c844c4ab33607532bc621caa",
            "title": "Chặt “mắt xích” đường dây ma túy lớn từ nước ngoài về Việt Nam",
            "link": "https://kenh14.vn/chat-mat-xich-duong-day-ma-tuy-lon-tu-nuoc-ngoai-ve-viet-nam-20230919193752637.chn",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Vào cuộc điều tra, cơ quan công an phát hiện Xồng Bá Xuân là một mắt xích quan trọng trong đường dây vận chuyển ma túy từ nước ngoài về Việt Nam tiêu thụ.",
            "content": null,
            "pubDate": "2023-09-19 13:20:58",
            "image_url": null,
            "source_id": "kenh14",
            "source_priority": 19897,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "4cc8aabe8844c8205c608abc9cae2238",
            "title": "Giả dạng sinh viên, lẻn vào trường đại học trộm cắp tài sản",
            "link": "https://kenh14.vn/gia-dang-sinh-vien-len-vao-truong-dai-hoc-trom-cap-tai-san-20230919200127885.chn",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Nam thanh niên thừa nhận đã giả dạng sinh viên thực hiện 4 vụ trộm cắp tài sản tại Trường Đại học Sư phạm Kỹ thuật TP HCM.",
            "content": null,
            "pubDate": "2023-09-19 13:15:00",
            "image_url": null,
            "source_id": "kenh14",
            "source_priority": 19897,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "222a6602e6fd2613846599ece4810c16",
            "title": "Á hậu Huyền My lộ diện với visual khác lạ, netizen bất ngờ: \"Không còn nhận ra\"",
            "link": "https://kenh14.vn/a-hau-huyen-my-lo-dien-voi-visual-khac-la-netizen-bat-ngo-khong-con-nhan-ra-2023091916031831.chn",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Đoạn clip mới nhất Á hậu Huyền My đăng tải thu hút hơn 1,1 triệu lượt xem.",
            "content": null,
            "pubDate": "2023-09-19 13:12:46",
            "image_url": null,
            "source_id": "kenh14",
            "source_priority": 19897,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "7e81875e43b9f26d9a5269cd38b01050",
            "title": "Đến trường đón con muộn 20 phút, hai vợ chồng đau đớn vì con bị bắt cóc suốt 9 năm",
            "link": "https://kenh14.vn/den-truong-don-con-muon-20-phut-hai-vo-chong-dau-don-vi-con-bi-bat-coc-suot-9-nam-20230919194049443.chn",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Sau nhiều năm tìm kiếm con gái, Trình Trúc không chỉ tiêu hết tiền tiết kiệm mà còn nợ hơn 200.000 NDT (gần 670 triệu đồng). Dù vậy, anh vẫn không bỏ cuộc, trong lòng luôn tin rằng con gái sẽ trở về.",
            "content": null,
            "pubDate": "2023-09-19 13:07:43",
            "image_url": null,
            "source_id": "kenh14",
            "source_priority": 19897,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "d49176804ad1747acf2c718dc2f2dde8",
            "title": "Một tay \"anh chị\" bị cảnh sát hình sự khống chế ngay trên phố, thu giữ 2 khẩu súng",
            "link": "https://kenh14.vn/mot-tay-anh-chi-bi-canh-sat-hinh-su-khong-che-ngay-tren-pho-thu-giu-2-khau-sung-20230919194159043.chn",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Chiều 19/9, Phòng Cảnh sát hình sự Công an thành phố Đà Nẵng cho biết, đang tạm giữ hình sự 2 đối tượng để tiếp tục điều tra, làm rõ hành vi “tàng trữ, sử dụng vũ khí trái phép”.",
            "content": null,
            "pubDate": "2023-09-19 13:05:37",
            "image_url": null,
            "source_id": "kenh14",
            "source_priority": 19897,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "2a44ddbc76e3caf46621bac268be5078",
            "title": "TikTok đang biến các sàn TMĐT Đông Nam Á như Shopee, Lazada thành “đồ cổ”?",
            "link": "https://kenh14.vn/tiktok-dang-bien-cac-san-tmdt-dong-nam-a-nhu-shopee-lazada-thanh-do-co-20230919200222041.chn",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Một mặt hàng giá 10 USD ở Lazada, 8 USD ở Shopee nhưng chỉ được bán 5 USD tại TikTok Shop, qua đó cho thấy khả năng thay thế các sàn TMĐT cũ của người chơi mới.",
            "content": null,
            "pubDate": "2023-09-19 13:01:00",
            "image_url": null,
            "source_id": "kenh14",
            "source_priority": 19897,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "18bc057e1c99d3cdf6dc31f44756945c",
            "title": "Học sinh Đồng Văn dần đổi lối sinh hoạt nhờ nhà vệ sinh đạt chuẩn",
            "link": "https://vnexpress.net/hoc-sinh-dong-van-dan-doi-loi-sinh-hoat-nho-nha-ve-sinh-dat-chuan-4654587.html",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Các học sinh biết vệ sinh, rửa tay đúng cách và giữ gìn nhà vệ sinh học đường sau khi các công trình của quỹ Hy vọng bàn giao được đưa vào sử dụng.",
            "content": null,
            "pubDate": "2023-09-19 13:00:25",
            "image_url": null,
            "source_id": "vnexpress",
            "source_priority": 4822,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "5d65ed4c11f9d1fe35b6cf890ed222f0",
            "title": "Phim có Hoàng Thùy Linh chưa chiếu đã gây sốt nhờ một nhân vật: Tấu hài quá duyên còn có kiểu tóc “dị” nhất sự nghiệp",
            "link": "https://kenh14.vn/phim-co-hoang-thuy-linh-chua-chieu-da-gay-sot-nho-mot-nhan-vat-tau-hai-qua-duyen-con-co-kieu-toc-di-nhat-su-nghiep-20230919165730301.chn",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Đây có lẽ sẽ là nhân vật thú vị nhất ở bộ phim mới của Hoàng Thùy Linh.",
            "content": null,
            "pubDate": "2023-09-19 13:00:10",
            "image_url": null,
            "source_id": "kenh14",
            "source_priority": 19897,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "d9520f06db23c4293f9b643923b26ae9",
            "title": "Cười té ghế với những “triết lý nhân sinh” cực ngầu nhưng liệu có hợp với giới trẻ?",
            "link": "https://kenh14.vn/cuoi-te-ghe-voi-nhung-triet-ly-nhan-sinh-cuc-ngau-nhung-lieu-co-hop-voi-gioi-tre-20230919190624115.chn",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Từ những câu nói quen thuộc được truyền miệng từ bao đời, ngày nay gen Z Việt đã \"chế\" lại để thể hiện đúng kinh nghiệm sống của mình trong thời đại mới, nghe rất \"cool\" (ngầu) nhưng có \"match\" (hợp) không thì cũng khá hên xui.",
            "content": null,
            "pubDate": "2023-09-19 13:00:00",
            "image_url": null,
            "source_id": "kenh14",
            "source_priority": 19897,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "235b36d8f0e4576010e1f62446a55eb5",
            "title": "Điều gì quyết định thụ tinh nhân tạo thành công?",
            "link": "https://vnexpress.net/dieu-gi-quyet-dinh-thu-tinh-nhan-tao-thanh-cong-4654536.html",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Tỷ lệ thành công của một chu kỳ thụ tinh nhân tạo phụ thuộc vào độ tuổi, tình trạng bệnh lý cũng như thời điểm thực hiện thủ thuật.",
            "content": null,
            "pubDate": "2023-09-19 13:00:00",
            "image_url": null,
            "source_id": "vnexpress",
            "source_priority": 4822,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "fcba14f6aae2353ef10e32ec8a80eb35",
            "title": "Tờ tiền in hình Lisa kèm chữ ký trong concert tại Hàn được BLINK rao bán 18 triệu",
            "link": "https://kenh14.vn/to-tien-in-hinh-lisa-kem-chu-ky-trong-concert-tai-han-duoc-blink-rao-ban-18-trieu-20230919183219219.chn",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Những tờ tiền giả có chữ ký của Lisa đang được các fan rao bán trên mạng với mức giá cao chót vót.",
            "content": null,
            "pubDate": "2023-09-19 13:00:00",
            "image_url": null,
            "source_id": "kenh14",
            "source_priority": 19897,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "865d1e4e16cc162c2c75b7c318ae6e60",
            "title": "Tinh thần thể thao trong BST Xtep Thu Đông 2023",
            "link": "https://vnexpress.net/tinh-than-the-thao-trong-bst-xtep-thu-dong-2023-4654883.html",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Thương hiệu thời trang Xtep vừa ra mắt loạt thiết kế hiện đại, trẻ trung, đậm chất thể thao, phóng khoáng và linh hoạt.",
            "content": null,
            "pubDate": "2023-09-19 13:00:00",
            "image_url": null,
            "source_id": "vnexpress",
            "source_priority": 4822,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "5fb259b97f3f3312c0a7518ae0b1005c",
            "title": "10 năm trước nhắn tin cho Big Daddy không được hồi âm, 10 năm sau Double2T đứng cùng sân khấu với vợ idol",
            "link": "https://kenh14.vn/10-nam-truoc-nhan-tin-cho-big-daddy-khong-duoc-hoi-am-10-nam-sau-double2t-dung-cung-san-khau-voi-vo-idol-20230919152937446.chn",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Đúng là “người miền núi chất” Double2T!",
            "content": null,
            "pubDate": "2023-09-19 13:00:00",
            "image_url": null,
            "source_id": "kenh14",
            "source_priority": 19897,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        },
        
        {
            "article_id": "4d8dafa9036e0fc60b81995b92a16937",
            "title": "Nagakawa ra mắt bộ sản phẩm điện lạnh, gia dụng 2024",
            "link": "https://vnexpress.net/nagakawa-ra-mat-bo-san-pham-dien-lanh-gia-dung-2024-4654901.html",
            "keywords": null,
            "creator": null,
            "video_url": null,
            "description": "Bộ sản phẩm mới thuộc 3 ngành hàng chiến lược là điện lạnh, gia dụng và thiết bị nhà bếp cao cấp, được giới thiệu vào ngày 19/9, tại khách sạn Sheraton Sài Gòn.",
            "content": null,
            "pubDate": "2023-09-19 13:00:00",
            "image_url": null,
            "source_id": "vnexpress",
            "source_priority": 4822,
            
            "country": [
                "vietnam"
            ],
            
            "category": [
                "top"
            ],
            "language": "vietnamese"
        }
    ],
    "nextPage": "1695128400519764786"

}
"""