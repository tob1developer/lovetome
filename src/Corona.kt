import com.google.gson.annotations.SerializedName

//(val Country: String, val cases:Int, val todayCases:Int, val Deaths:Int,val TodayDeaths: Int, val recovered: Int)
data class Corona(
    @field:SerializedName("country") // <<== dinh nghia cho tu can gan
    val Country: String? =null,
    @field:SerializedName("cases")
    val Cases: Int? =null,
    @field:SerializedName("todayCases")
    val TodayCases: Int? =null,
    @field:SerializedName("deaths")
    val Deaths: Int? =null,
    @field:SerializedName("todayDeaths")
    val TodayDeaths: Int? =null,
    @field:SerializedName("recovered")
    val Recovered: Int? =null
)