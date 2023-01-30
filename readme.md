# Austrian Kicker Award Statistics

Given is the list of winners of the Austrian Kicker Award. 
One award is granted per year.   
The list is composed of 4 columns: 
* kicker name, 
* club for which the award has been won, 
* year of the award 
* and the reached score in points.

__Note__ that the list contains a header!

## Objectives

You shall develop a tiny application that provides some statistics about the winners.
It is safe to rely on the correctness of the input.

1. Implement a class that encapsulates a single awarded kicker (one line of the lists).
Considered that this class can already provide some functionality beyond holding data.
1. Implement a class that encapsulates the aggregated awards of a single club. 
This class features the club name, the list of distinct kickers that have won awards for this 
club, the list of distinct years awards have been won and the total score. The kickers and
years have no relationship within this class.
__Note__ that kickers might have been awarded for different clubs and that the list of kickers 
and the list of years may be of different size.
1. Implement the application:
   1. Implement a singleton application class. No method other than the singleton 
      factory method shall be static. 
   1. Implement a method that reads the CSV into a list of 'kickers' (see Point 1)
   __Note__: If directory 'res' is marked as resource root within IDEA, then `Path.of("res/austrian_kicker_awards.csv")`
   should work well.
   1. Implement a method that aggregates the list of kickers into a Map(!) of clubs. 
   The map shall use the club name as key for easier handling.
   1. Implement the statistic methods using __Streaming API__. The method signatures
   are already given and their names should clearly denote their functionality. 
      Actually all of those methods are rather short single line implementations.
   1. Consider also the comments. 

## Sample Output
<pre><code>
Winners from 1900 to 1980
1968: Johnny Bjerregaard, SK Rapid Wien - 4461
1967: Leopold Grausam, SK Rapid Wien - 6616
1969: Thomas Parits, FK Austria Wien - 8925
1970: Johnny Bjerregaard, SK Rapid Wien - 8426
1971: Peter Pumm, Donawitzer SV Alpine - 45669
1972: Geza Gallos, SK Rapid Wien - 26367
1973: Hans Krankl, SK Rapid Wien - 24882
1974: Hans Krankl, SK Rapid Wien - 17306
1975: Herbert Prohaska, FK Austria Wien - 17780
1976: Walter Schachner, Donawitzer SV Alpine - 152636
1977: Hans Krankl, SK Rapid Wien - 154706
1978: Walter Schachner, FK Austria Wien - 181032
1979: Walter Schachner, FK Austria Wien - 290547
1980: Herbert Feurer, SK Rapid Wien - 419762

Winners from 1980 to 1999
1980: Herbert Feurer, SK Rapid Wien - 419762
1981: Herbert Feurer, SK Rapid Wien - 613741
1982: Hans Krankl, SK Rapid Wien - 806986
1983: Robert Sara, FK Austria Wien - 1129165
1984: Peter Pacult, SK Rapid Wien - 1007349
1985: Herbert Prohaska, FK Austria Wien - 886491
1986: Reinhard Kienast, SK Rapid Wien - 446371
1987: Michael Konsel, SK Rapid Wien - 320780
1988: Hans Krankl, SV Austria Salzburg - 387615
1989: Jan Åge Fjørtoft, SK Rapid Wien - 428754
1990: Robert Pecl, SK Rapid Wien - 455107
1991: Robert Pecl, SK Rapid Wien - 330915
1992: Andreas Herzog, Werder Bremen - 201507
1993: Otto Konrad, SV Austria Salzburg - 186948
1994: Otto Konrad, SV Austria Salzburg - 236261
1995: Michael Konsel, SK Rapid Wien - 212373
1996: Dietmar Kühbauer, SK Rapid Wien - 304808
1997: Dietmar Kühbauer, Real Sociedad - 368904
1998: Dietmar Kühbauer, Real Sociedad - 460024
1999: Ivica Vastić, SK Sturm Graz - 478640

Winners from 2000 to 2100
2000: Markus Schopp, SK Sturm Graz - 430769
2001: Roman Wallner, SK Rapid Wien - 362913
2002: Dietmar Kühbauer, SV Mattersburg - 536520
2003: Dietmar Kühbauer, SV Mattersburg - 882533
2004: Dietmar Kühbauer, SV Mattersburg - 987683
2005: Steffen Hofmann, SK Rapid Wien - 221278
2006: Steffen Hofmann, SK Rapid Wien - 274922
2007: Sebastian Prödl, SK Sturm Graz - 247722
2008: Steffen Hofmann, SK Rapid Wien - 260296
2009: Steffen Hofmann, SK Rapid Wien - 283969
2010: Zlatko Junuzović, FK Austria Wien - 283900
2011: Steffen Hofmann, SK Rapid Wien - 281474
2012: Philipp Hosiner, FK Austria Wien - 255735
2013: David Alaba, FC Bayern München - 264272
2014: David Alaba, FC Bayern München - 308631
2015: David Alaba, FC Bayern München - 431477
2016: Louis Schaub, SK Rapid Wien - 175689
2017: Louis Schaub, SK Rapid Wien - 125896
2018: Marko Arnautovic, West Ham United - 133456

Winners called Herbert
1975: Herbert Prohaska, FK Austria Wien - 17780
1980: Herbert Feurer, SK Rapid Wien - 419762
1981: Herbert Feurer, SK Rapid Wien - 613741
1985: Herbert Prohaska, FK Austria Wien - 886491

Winners called Peter
1971: Peter Pumm, Donawitzer SV Alpine - 45669
1984: Peter Pacult, SK Rapid Wien - 1007349

28 distinct winners in 52 years

Winners with the highest score:
1983: Robert Sara, FK Austria Wien - 1129165

Clubs ordered by name:
Donawitzer SV Alpine scored 198305 points in total
by Peter Pumm, Walter Schachner
in 1971, 1976

FC Bayern München scored 1004380 points in total
by David Alaba
in 2013, 2014, 2015

FK Austria Wien scored 3053575 points in total
by Thomas Parits, Herbert Prohaska, Walter Schachner, Robert Sara, Zlatko Junuzović, Philipp Hosiner
in 1969, 1975, 1978, 1979, 1983, 1985, 2010, 2012

Real Sociedad scored 828928 points in total
by Dietmar Kühbauer
in 1997, 1998

SK Rapid Wien scored 7576147 points in total
by Johnny Bjerregaard, Leopold Grausam, Geza Gallos, Hans Krankl, Herbert Feurer, Peter Pacult, Reinhard Kienast, Michael Konsel, Jan Åge Fjørtoft, Robert Pecl, Dietmar Kühbauer, Roman Wallner, Steffen Hofmann, Louis Schaub
in 1968, 1967, 1970, 1972, 1973, 1974, 1977, 1980, 1981, 1982, 1984, 1986, 1987, 1989, 1990, 1991, 1995, 1996, 2001, 2005, 2006, 2008, 2009, 2011, 2016, 2017

SK Sturm Graz scored 1157131 points in total
by Ivica Vastić, Markus Schopp, Sebastian Prödl
in 1999, 2000, 2007

SV Austria Salzburg scored 810824 points in total
by Hans Krankl, Otto Konrad
in 1988, 1993, 1994

SV Mattersburg scored 2406736 points in total
by Dietmar Kühbauer
in 2002, 2003, 2004

Werder Bremen scored 201507 points in total
by Andreas Herzog
in 1992

West Ham United scored 133456 points in total
by Marko Arnautovic
in 2018


Top 5 clubs:
SK Rapid Wien scored 7576147 points in total
by Johnny Bjerregaard, Leopold Grausam, Geza Gallos, Hans Krankl, Herbert Feurer, Peter Pacult, Reinhard Kienast, Michael Konsel, Jan Åge Fjørtoft, Robert Pecl, Dietmar Kühbauer, Roman Wallner, Steffen Hofmann, Louis Schaub
in 1968, 1967, 1970, 1972, 1973, 1974, 1977, 1980, 1981, 1982, 1984, 1986, 1987, 1989, 1990, 1991, 1995, 1996, 2001, 2005, 2006, 2008, 2009, 2011, 2016, 2017

FK Austria Wien scored 3053575 points in total
by Thomas Parits, Herbert Prohaska, Walter Schachner, Robert Sara, Zlatko Junuzović, Philipp Hosiner
in 1969, 1975, 1978, 1979, 1983, 1985, 2010, 2012

SV Mattersburg scored 2406736 points in total
by Dietmar Kühbauer
in 2002, 2003, 2004

SK Sturm Graz scored 1157131 points in total
by Ivica Vastić, Markus Schopp, Sebastian Prödl
in 1999, 2000, 2007

FC Bayern München scored 1004380 points in total
by David Alaba
in 2013, 2014, 2015


Last 3 clubs:
West Ham United scored 133456 points in total
by Marko Arnautovic
in 2018

Donawitzer SV Alpine scored 198305 points in total
by Peter Pumm, Walter Schachner
in 1971, 1976

Werder Bremen scored 201507 points in total
by Andreas Herzog
in 1992
</code></pre>
