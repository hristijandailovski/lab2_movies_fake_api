package com.hfad.lab_2movies.dataholder

import com.hfad.lab_2movies.model.Actor
import com.hfad.lab_2movies.model.Movie


class DataHolder {
    companion object{
            val movies:MutableList<Movie> = mutableListOf(
            Movie("Title0","Description0","Producer0",mutableListOf(Actor("Name0","Surname0"), Actor("Name0","Surname0"), Actor("Name0","Surname0"), Actor("Name0","Surname0"), Actor("Name0","Surname0"))),
            Movie("Title1","Description1","Producer1",mutableListOf(Actor("Name5","Surname5"), Actor("Name5","Surname5"), Actor("Name5","Surname5"), Actor("Name5","Surname5"), Actor("Name5","Surname5"))),
            Movie("Title2","Description2","Producer2",mutableListOf(Actor("Name10","Surname10"), Actor("Name10","Surname10"), Actor("Name10","Surname10"), Actor("Name10","Surname10"), Actor("Name10","Surname10"))),
            Movie("Title3","Description3","Producer3",mutableListOf(Actor("Name15","Surname15"), Actor("Name15","Surname15"), Actor("Name15","Surname15"), Actor("Name15","Surname15"), Actor("Name15","Surname15"))),
            Movie("Title4","Description4","Producer4",mutableListOf(Actor("Name20","Surname20"), Actor("Name20","Surname20"), Actor("Name20","Surname20"), Actor("Name20","Surname20"), Actor("Name20","Surname20"))),
            Movie("Title5","Description5","Producer5",mutableListOf(Actor("Name25","Surname25"), Actor("Name25","Surname25"), Actor("Name25","Surname25"), Actor("Name25","Surname25"), Actor("Name25","Surname25"))),
            Movie("Title6","Description6","Producer6",mutableListOf(Actor("Name30","Surname30"), Actor("Name30","Surname30"), Actor("Name30","Surname30"), Actor("Name30","Surname30"), Actor("Name30","Surname30"))),
            Movie("Title7","Description7","Producer7",mutableListOf(Actor("Name35","Surname35"), Actor("Name35","Surname35"), Actor("Name35","Surname35"), Actor("Name35","Surname35"), Actor("Name35","Surname35"))),
            Movie("Title8","Description8","Producer8",mutableListOf(Actor("Name40","Surname40"), Actor("Name40","Surname40"), Actor("Name40","Surname40"), Actor("Name40","Surname40"), Actor("Name40","Surname40"))),
            Movie("Title9","Description9","Producer9",mutableListOf(Actor("Name45","Surname45"), Actor("Name45","Surname45"), Actor("Name45","Surname45"), Actor("Name45","Surname45"), Actor("Name45","Surname45"))),
            Movie("Title10","Description10","Producer10",mutableListOf(Actor("Name50","Surname50"), Actor("Name50","Surname50"), Actor("Name50","Surname50"), Actor("Name50","Surname50"), Actor("Name50","Surname50"))),
            Movie("Title11","Description11","Producer11",mutableListOf(Actor("Name55","Surname55"), Actor("Name55","Surname55"), Actor("Name55","Surname55"), Actor("Name55","Surname55"), Actor("Name55","Surname55"))),
            Movie("Title12","Description12","Producer12",mutableListOf(Actor("Name60","Surname60"), Actor("Name60","Surname60"), Actor("Name60","Surname60"), Actor("Name60","Surname60"), Actor("Name60","Surname60"))),
            Movie("Title13","Description13","Producer13",mutableListOf(Actor("Name65","Surname65"), Actor("Name65","Surname65"), Actor("Name65","Surname65"), Actor("Name65","Surname65"), Actor("Name65","Surname65"))),
            Movie("Title14","Description14","Producer14",mutableListOf(Actor("Name70","Surname70"), Actor("Name70","Surname70"), Actor("Name70","Surname70"), Actor("Name70","Surname70"), Actor("Name70","Surname70"))),
            Movie("Title15","Description15","Producer15",mutableListOf(Actor("Name75","Surname75"), Actor("Name75","Surname75"), Actor("Name75","Surname75"), Actor("Name75","Surname75"), Actor("Name75","Surname75"))),
            Movie("Title16","Description16","Producer16",mutableListOf(Actor("Name80","Surname80"), Actor("Name80","Surname80"), Actor("Name80","Surname80"), Actor("Name80","Surname80"), Actor("Name80","Surname80"))),
            Movie("Title17","Description17","Producer17",mutableListOf(Actor("Name85","Surname85"), Actor("Name85","Surname85"), Actor("Name85","Surname85"), Actor("Name85","Surname85"), Actor("Name85","Surname85"))),
            Movie("Title18","Description18","Producer18",mutableListOf(Actor("Name90","Surname90"), Actor("Name90","Surname90"), Actor("Name90","Surname90"), Actor("Name90","Surname90"), Actor("Name90","Surname90"))),
            Movie("Title19","Description19","Producer19",mutableListOf(Actor("Name95","Surname95"), Actor("Name95","Surname95"), Actor("Name95","Surname95"), Actor("Name95","Surname95"), Actor("Name95","Surname95"))),
            Movie("Title20","Description20","Producer20",mutableListOf(Actor("Name100","Surname100"), Actor("Name100","Surname100"), Actor("Name100","Surname100"), Actor("Name100","Surname100"), Actor("Name100","Surname100"))),
            Movie("Title21","Description21","Producer21",mutableListOf(Actor("Name105","Surname105"), Actor("Name105","Surname105"), Actor("Name105","Surname105"), Actor("Name105","Surname105"), Actor("Name105","Surname105"))),
            Movie("Title22","Description22","Producer22",mutableListOf(Actor("Name110","Surname110"), Actor("Name110","Surname110"), Actor("Name110","Surname110"), Actor("Name110","Surname110"), Actor("Name110","Surname110"))),
            Movie("Title23","Description23","Producer23",mutableListOf(Actor("Name115","Surname115"), Actor("Name115","Surname115"), Actor("Name115","Surname115"), Actor("Name115","Surname115"), Actor("Name115","Surname115"))),
            Movie("Title24","Description24","Producer24",mutableListOf(Actor("Name120","Surname120"), Actor("Name120","Surname120"), Actor("Name120","Surname120"), Actor("Name120","Surname120"), Actor("Name120","Surname120"))),
            Movie("Title25","Description25","Producer25",mutableListOf(Actor("Name125","Surname125"), Actor("Name125","Surname125"), Actor("Name125","Surname125"), Actor("Name125","Surname125"), Actor("Name125","Surname125"))),
            Movie("Title26","Description26","Producer26",mutableListOf(Actor("Name130","Surname130"), Actor("Name130","Surname130"), Actor("Name130","Surname130"), Actor("Name130","Surname130"), Actor("Name130","Surname130"))),
            Movie("Title27","Description27","Producer27",mutableListOf(Actor("Name135","Surname135"), Actor("Name135","Surname135"), Actor("Name135","Surname135"), Actor("Name135","Surname135"), Actor("Name135","Surname135"))),
            Movie("Title28","Description28","Producer28",mutableListOf(Actor("Name140","Surname140"), Actor("Name140","Surname140"), Actor("Name140","Surname140"), Actor("Name140","Surname140"), Actor("Name140","Surname140"))),
            Movie("Title29","Description29","Producer29",mutableListOf(Actor("Name145","Surname145"), Actor("Name145","Surname145"), Actor("Name145","Surname145"), Actor("Name145","Surname145"), Actor("Name145","Surname145"))),
            Movie("Title30","Description30","Producer30",mutableListOf(Actor("Name150","Surname150"), Actor("Name150","Surname150"), Actor("Name150","Surname150"), Actor("Name150","Surname150"), Actor("Name150","Surname150"))),
            Movie("Title31","Description31","Producer31",mutableListOf(Actor("Name155","Surname155"), Actor("Name155","Surname155"), Actor("Name155","Surname155"), Actor("Name155","Surname155"), Actor("Name155","Surname155"))),
            Movie("Title32","Description32","Producer32",mutableListOf(Actor("Name160","Surname160"), Actor("Name160","Surname160"), Actor("Name160","Surname160"), Actor("Name160","Surname160"), Actor("Name160","Surname160"))),
            Movie("Title33","Description33","Producer33",mutableListOf(Actor("Name165","Surname165"), Actor("Name165","Surname165"), Actor("Name165","Surname165"), Actor("Name165","Surname165"), Actor("Name165","Surname165"))),
            Movie("Title34","Description34","Producer34",mutableListOf(Actor("Name170","Surname170"), Actor("Name170","Surname170"), Actor("Name170","Surname170"), Actor("Name170","Surname170"), Actor("Name170","Surname170"))),
            Movie("Title35","Description35","Producer35",mutableListOf(Actor("Name175","Surname175"), Actor("Name175","Surname175"), Actor("Name175","Surname175"), Actor("Name175","Surname175"), Actor("Name175","Surname175"))),
            Movie("Title36","Description36","Producer36",mutableListOf(Actor("Name180","Surname180"), Actor("Name180","Surname180"), Actor("Name180","Surname180"), Actor("Name180","Surname180"), Actor("Name180","Surname180"))),
            Movie("Title37","Description37","Producer37",mutableListOf(Actor("Name185","Surname185"), Actor("Name185","Surname185"), Actor("Name185","Surname185"), Actor("Name185","Surname185"), Actor("Name185","Surname185"))),
            Movie("Title38","Description38","Producer38",mutableListOf(Actor("Name190","Surname190"), Actor("Name190","Surname190"), Actor("Name190","Surname190"), Actor("Name190","Surname190"), Actor("Name190","Surname190"))),
            Movie("Title39","Description39","Producer39",mutableListOf(Actor("Name195","Surname195"), Actor("Name195","Surname195"), Actor("Name195","Surname195"), Actor("Name195","Surname195"), Actor("Name195","Surname195"))),
            Movie("Title40","Description40","Producer40",mutableListOf(Actor("Name200","Surname200"), Actor("Name200","Surname200"), Actor("Name200","Surname200"), Actor("Name200","Surname200"), Actor("Name200","Surname200"))),
            Movie("Title41","Description41","Producer41",mutableListOf(Actor("Name205","Surname205"), Actor("Name205","Surname205"), Actor("Name205","Surname205"), Actor("Name205","Surname205"), Actor("Name205","Surname205"))),
            Movie("Title42","Description42","Producer42",mutableListOf(Actor("Name210","Surname210"), Actor("Name210","Surname210"), Actor("Name210","Surname210"), Actor("Name210","Surname210"), Actor("Name210","Surname210"))),
            Movie("Title43","Description43","Producer43",mutableListOf(Actor("Name215","Surname215"), Actor("Name215","Surname215"), Actor("Name215","Surname215"), Actor("Name215","Surname215"), Actor("Name215","Surname215"))),
            Movie("Title44","Description44","Producer44",mutableListOf(Actor("Name220","Surname220"), Actor("Name220","Surname220"), Actor("Name220","Surname220"), Actor("Name220","Surname220"), Actor("Name220","Surname220"))),
            Movie("Title45","Description45","Producer45",mutableListOf(Actor("Name225","Surname225"), Actor("Name225","Surname225"), Actor("Name225","Surname225"), Actor("Name225","Surname225"), Actor("Name225","Surname225"))),
            Movie("Title46","Description46","Producer46",mutableListOf(Actor("Name230","Surname230"), Actor("Name230","Surname230"), Actor("Name230","Surname230"), Actor("Name230","Surname230"), Actor("Name230","Surname230"))),
            Movie("Title47","Description47","Producer47",mutableListOf(Actor("Name235","Surname235"), Actor("Name235","Surname235"), Actor("Name235","Surname235"), Actor("Name235","Surname235"), Actor("Name235","Surname235"))),
            Movie("Title48","Description48","Producer48",mutableListOf(Actor("Name240","Surname240"), Actor("Name240","Surname240"), Actor("Name240","Surname240"), Actor("Name240","Surname240"), Actor("Name240","Surname240"))),
            Movie("Title49","Description49","Producer49",mutableListOf(Actor("Name245","Surname245"), Actor("Name245","Surname245"), Actor("Name245","Surname245"), Actor("Name245","Surname245"), Actor("Name245","Surname245"))))
            get() =field

        fun save(movie: Movie) {
            movies.add(movie)
        }
    }
}