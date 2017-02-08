package com.leoxnidas.phoneedittextexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.github.leoxnidas.phoneedittext.Codes;
import com.github.leoxnidas.phoneedittext.PhoneEditText;


public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener {

    private PhoneEditText phoneEdittext;
    private Spinner codes;
    private ArrayAdapter<String> mAdapterCodes;

    private String[] CODES;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phoneEdittext = (PhoneEditText) findViewById(R.id.phone_code);


        codes = (Spinner) findViewById(R.id.codes);
        CODES = getResources().getStringArray(R.array.CODES);
        mAdapterCodes = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, CODES);
        codes.setAdapter(mAdapterCodes);
        codes.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String country = ((TextView)view).getText().toString();

        if(country.equals("Afghanistan"))
            phoneEdittext.setCode(Codes.AFG);
        if(country.equals("Albania"))
            phoneEdittext.setCode(Codes.ALB);
        if(country.equals("Algeria"))
            phoneEdittext.setCode(Codes.DZA);
        if(country.equals("American Samoa"))
            phoneEdittext.setCode(Codes.ASM);
        if(country.equals("Andorra"))
            phoneEdittext.setCode(Codes.AND);
        if(country.equals("Angola"))
            phoneEdittext.setCode(Codes.AGO);
        if(country.equals("Anguilla"))
            phoneEdittext.setCode(Codes.AIA);
        if(country.equals("Antarctica"))
            phoneEdittext.setCode(Codes.ATA);
        if(country.equals("Antigua and Barbuda"))
            phoneEdittext.setCode(Codes.ATG);
        if(country.equals("Argentina"))
            phoneEdittext.setCode(Codes.ARG);
        if(country.equals("Armenia"))
            phoneEdittext.setCode(Codes.ARM);
        if(country.equals("Aruba"))
            phoneEdittext.setCode(Codes.ABW);
        if(country.equals("Australia"))
            phoneEdittext.setCode(Codes.AUS);
        if(country.equals("Austria"))
            phoneEdittext.setCode(Codes.AUT);
        if(country.equals("Azerbaijan"))
            phoneEdittext.setCode(Codes.AZE);
        if(country.equals("Bahamas"))
            phoneEdittext.setCode(Codes.BHS);
        if(country.equals("Bahrain"))
            phoneEdittext.setCode(Codes.BHR);
        if(country.equals("Bangladesh"))
            phoneEdittext.setCode(Codes.BGD);
        if(country.equals("Barbados"))
            phoneEdittext.setCode(Codes.BRB);
        if(country.equals("Belarus"))
            phoneEdittext.setCode(Codes.BLR);
        if(country.equals("Belgium"))
            phoneEdittext.setCode(Codes.BEL);
        if(country.equals("Belize"))
            phoneEdittext.setCode(Codes.BLZ);
        if(country.equals("Benin"))
            phoneEdittext.setCode(Codes.BEN);
        if(country.equals("Bermuda"))
            phoneEdittext.setCode(Codes.BMU);
        if(country.equals("Bhutan"))
            phoneEdittext.setCode(Codes.BTN);
        if(country.equals("Bolivia"))
            phoneEdittext.setCode(Codes.BOL);
        if(country.equals("Bosnia and Herzegovina"))
            phoneEdittext.setCode(Codes.BIH);
        if(country.equals("Botswana"))
            phoneEdittext.setCode(Codes.BWA);
        if(country.equals("Brazil"))
            phoneEdittext.setCode(Codes.BRA);
        if(country.equals("British Indian Ocean Territory"))
            phoneEdittext.setCode(Codes.IOT);
        if(country.equals("British Virgin Islands"))
            phoneEdittext.setCode(Codes.VGB);
        if(country.equals("Brunei"))
            phoneEdittext.setCode(Codes.BRN);
        if(country.equals("Bulgaria"))
            phoneEdittext.setCode(Codes.BGR);
        if(country.equals("Burkina Faso"))
            phoneEdittext.setCode(Codes.BFA);
        if(country.equals("Burundi"))
            phoneEdittext.setCode(Codes.BDI);
        if(country.equals("Cambodia"))
            phoneEdittext.setCode(Codes.KHM);
        if(country.equals("Cameroon"))
            phoneEdittext.setCode(Codes.CMR);
        if(country.equals("Canada"))
            phoneEdittext.setCode(Codes.CAN);
        if(country.equals("Cape Verde"))
            phoneEdittext.setCode(Codes.CPV);
        if(country.equals("Cayman Islands"))
            phoneEdittext.setCode(Codes.CYM);
        if(country.equals("Central African Republic"))
            phoneEdittext.setCode(Codes.CAF);
        if(country.equals("Chad"))
            phoneEdittext.setCode(Codes.TCD);
        if(country.equals("Chile"))
            phoneEdittext.setCode(Codes.CHL);
        if(country.equals("China"))
            phoneEdittext.setCode(Codes.CHN);
        if(country.equals("Christmas Island"))
            phoneEdittext.setCode(Codes.CXR);
        if(country.equals("Cocos Islands"))
            phoneEdittext.setCode(Codes.CCK);
        if(country.equals("Colombia"))
            phoneEdittext.setCode(Codes.COL);
        if(country.equals("Comoros"))
            phoneEdittext.setCode(Codes.COM);
        if(country.equals("Cook Islands"))
            phoneEdittext.setCode(Codes.COK);
        if(country.equals("Costa Rica"))
            phoneEdittext.setCode(Codes.CRI);
        if(country.equals("Croatia"))
            phoneEdittext.setCode(Codes.HRV);
        if(country.equals("Cuba"))
            phoneEdittext.setCode(Codes.CUB);
        if(country.equals("Curacao"))
            phoneEdittext.setCode(Codes.CUW);
        if(country.equals("Cyprus"))
            phoneEdittext.setCode(Codes.CYP);
        if(country.equals("Czech Republic"))
            phoneEdittext.setCode(Codes.CZE);
        if(country.equals("Democratic Republic of the Congo"))
            phoneEdittext.setCode(Codes.COD);
        if(country.equals("Denmark"))
            phoneEdittext.setCode(Codes.DNK);
        if(country.equals("Djibouti"))
            phoneEdittext.setCode(Codes.DJI);
        if(country.equals("Djibouti"))
            phoneEdittext.setCode(Codes.DMA);
        if(country.equals("Dominican Republic"))
            phoneEdittext.setCode(Codes.DOM);
        if(country.equals("East Timor"))
            phoneEdittext.setCode(Codes.TLS);
        if(country.equals("Ecuador"))
            phoneEdittext.setCode(Codes.ECU);
        if(country.equals("Egypt"))
            phoneEdittext.setCode(Codes.EGY);
        if(country.equals("El Salvador"))
            phoneEdittext.setCode(Codes.SLV);
        if(country.equals("Equatorial Guinea"))
            phoneEdittext.setCode(Codes.GNQ);
        if(country.equals("Eritrea"))
            phoneEdittext.setCode(Codes.ERI);
        if(country.equals("Estonia"))
            phoneEdittext.setCode(Codes.EST);
        if(country.equals("Ethiopia"))
            phoneEdittext.setCode(Codes.ETH);
        if(country.equals("Falkland Islands"))
            phoneEdittext.setCode(Codes.FLK);
        if(country.equals("Faroe Islands"))
            phoneEdittext.setCode(Codes.FRO);
        if(country.equals("Fiji"))
            phoneEdittext.setCode(Codes.FJI);
        if(country.equals("Finland"))
            phoneEdittext.setCode(Codes.FIN);
        if(country.equals("France"))
            phoneEdittext.setCode(Codes.FRA);
        if(country.equals("French Polynesia"))
            phoneEdittext.setCode(Codes.PYF);
        if(country.equals("Gabon"))
            phoneEdittext.setCode(Codes.GAB);
        if(country.equals("Gambia"))
            phoneEdittext.setCode(Codes.GMB);
        if(country.equals("Georgia"))
            phoneEdittext.setCode(Codes.GEO);
        if(country.equals("Germany"))
            phoneEdittext.setCode(Codes.DEU);
        if(country.equals("Ghana"))
            phoneEdittext.setCode(Codes.GHA);
        if(country.equals("Gibraltar"))
            phoneEdittext.setCode(Codes.GIB);
        if(country.equals("Greece"))
            phoneEdittext.setCode(Codes.GRC);
        if(country.equals("Greenland"))
            phoneEdittext.setCode(Codes.GRL);
        if(country.equals("Grenada"))
            phoneEdittext.setCode(Codes.GRD);
        if(country.equals("Guam"))
            phoneEdittext.setCode(Codes.GUM);
        if(country.equals("Guatemala"))
            phoneEdittext.setCode(Codes.GTM);
        if(country.equals("Guernsey"))
            phoneEdittext.setCode(Codes.GGY);
        if(country.equals("Guinea"))
            phoneEdittext.setCode(Codes.GIN);
        if(country.equals("Guinea-Bissau"))
            phoneEdittext.setCode(Codes.GNB);
        if(country.equals("Guyana"))
            phoneEdittext.setCode(Codes.GUY);
        if(country.equals("Haiti"))
            phoneEdittext.setCode(Codes.HTI);
        if(country.equals("Honduras"))
            phoneEdittext.setCode(Codes.HND);
        if(country.equals("Hong Kong"))
            phoneEdittext.setCode(Codes.HKG);
        if(country.equals("Hungary"))
            phoneEdittext.setCode(Codes.HUN);
        if(country.equals("Iceland"))
            phoneEdittext.setCode(Codes.ISL);
        if(country.equals("India"))
            phoneEdittext.setCode(Codes.IND);
        if(country.equals("Indonesia"))
            phoneEdittext.setCode(Codes.IDN);
        if(country.equals("Iran"))
            phoneEdittext.setCode(Codes.IRN);
        if(country.equals("Iraq"))
            phoneEdittext.setCode(Codes.IRQ);
        if(country.equals("Ireland"))
            phoneEdittext.setCode(Codes.IRL);
        if(country.equals("Isle of Man"))
            phoneEdittext.setCode(Codes.IMN);
        if(country.equals("Israel"))
            phoneEdittext.setCode(Codes.ISR);
        if(country.equals("Italy"))
            phoneEdittext.setCode(Codes.ITA);
        if(country.equals("Ivory Coast"))
            phoneEdittext.setCode(Codes.CIV);
        if(country.equals("Jamaica"))
            phoneEdittext.setCode(Codes.JAM);
        if(country.equals("Japan"))
            phoneEdittext.setCode(Codes.JPN);
        if(country.equals("Jersey"))
            phoneEdittext.setCode(Codes.JEY);
        if(country.equals("Jordan"))
            phoneEdittext.setCode(Codes.JOR);
        if(country.equals("Kazakhstan"))
            phoneEdittext.setCode(Codes.KAZ);
        if(country.equals("Kenya"))
            phoneEdittext.setCode(Codes.KEN);
        if(country.equals("Kiribati"))
            phoneEdittext.setCode(Codes.KIR);
        if(country.equals("Kosovo"))
            phoneEdittext.setCode(Codes.XKX);
        if(country.equals("Kuwait"))
            phoneEdittext.setCode(Codes.KWT);
        if(country.equals("Kyrgyzstan"))
            phoneEdittext.setCode(Codes.KGZ);
        if(country.equals("Laos"))
            phoneEdittext.setCode(Codes.LAO);
        if(country.equals("Latvia"))
            phoneEdittext.setCode(Codes.LVA);
        if(country.equals("Lebanon"))
            phoneEdittext.setCode(Codes.LBN);
        if(country.equals("Lesotho"))
            phoneEdittext.setCode(Codes.LSO);
        if(country.equals("Liberia"))
            phoneEdittext.setCode(Codes.LBR);
        if(country.equals("Libya"))
            phoneEdittext.setCode(Codes.LBY);
        if(country.equals("Liechtenstein"))
            phoneEdittext.setCode(Codes.LIE);
        if(country.equals("Lithuania"))
            phoneEdittext.setCode(Codes.LTU);
        if(country.equals("Luxembourg"))
            phoneEdittext.setCode(Codes.LUX);
        if(country.equals("Macau"))
            phoneEdittext.setCode(Codes.MAC);
        if(country.equals("Macedonia"))
            phoneEdittext.setCode(Codes.MKD);
        if(country.equals("Madagascar"))
            phoneEdittext.setCode(Codes.MDG);
        if(country.equals("Malawi"))
            phoneEdittext.setCode(Codes.MWI);
        if(country.equals("Malaysia"))
            phoneEdittext.setCode(Codes.MYS);
        if(country.equals("Maldives"))
            phoneEdittext.setCode(Codes.MDV);
        if(country.equals("Mali"))
            phoneEdittext.setCode(Codes.MLI);
        if(country.equals("Malta"))
            phoneEdittext.setCode(Codes.MLT);
        if(country.equals("Marshall Islands"))
            phoneEdittext.setCode(Codes.MHL);
        if(country.equals("Mauritania"))
            phoneEdittext.setCode(Codes.MRT);
        if(country.equals("Mauritius"))
            phoneEdittext.setCode(Codes.MUS);
        if(country.equals("Mayotte"))
            phoneEdittext.setCode(Codes.MYT);
        if(country.equals("Mexico"))
            phoneEdittext.setCode(Codes.MEX);
        if(country.equals("Micronesia"))
            phoneEdittext.setCode(Codes.FSM);
        if(country.equals("Moldova"))
            phoneEdittext.setCode(Codes.MDA);
        if(country.equals("Monaco"))
            phoneEdittext.setCode(Codes.MCO);
        if(country.equals("Mongolia"))
            phoneEdittext.setCode(Codes.MNG);
        if(country.equals("Montenegro"))
            phoneEdittext.setCode(Codes.MNE);
        if(country.equals("Montserrat"))
            phoneEdittext.setCode(Codes.MSR);
        if(country.equals("Morocco"))
            phoneEdittext.setCode(Codes.MAR);
        if(country.equals("Mozambique"))
            phoneEdittext.setCode(Codes.MOZ);
        if(country.equals("Myanmar"))
            phoneEdittext.setCode(Codes.MMR);
        if(country.equals("Namibia"))
            phoneEdittext.setCode(Codes.NAM);
        if(country.equals("Nauru"))
            phoneEdittext.setCode(Codes.NRU);
        if(country.equals("Nepal"))
            phoneEdittext.setCode(Codes.NPL);
        if(country.equals("Netherlands"))
            phoneEdittext.setCode(Codes.NLD);
        if(country.equals("Netherlands Antilles"))
            phoneEdittext.setCode(Codes.ANT);
        if(country.equals("New Caledonia"))
            phoneEdittext.setCode(Codes.NCL);
        if(country.equals("New Zealand"))
            phoneEdittext.setCode(Codes.NZL);
        if(country.equals("Nicaragua"))
            phoneEdittext.setCode(Codes.NIC);
        if(country.equals("Niger"))
            phoneEdittext.setCode(Codes.NER);
        if(country.equals("Nigeria"))
            phoneEdittext.setCode(Codes.NGA);
        if(country.equals("Niue"))
            phoneEdittext.setCode(Codes.NIU);
        if(country.equals("North Korea"))
            phoneEdittext.setCode(Codes.PRK);
        if(country.equals("Northern Mariana Islands"))
            phoneEdittext.setCode(Codes.MNP);
        if(country.equals("Norway"))
            phoneEdittext.setCode(Codes.NOR);
        if(country.equals("Oman"))
            phoneEdittext.setCode(Codes.OMN);
        if(country.equals("Pakistan"))
            phoneEdittext.setCode(Codes.PAK);
        if(country.equals("Palau"))
            phoneEdittext.setCode(Codes.PLW);
        if(country.equals("Palestine"))
            phoneEdittext.setCode(Codes.PSE);
        if(country.equals("Panama"))
            phoneEdittext.setCode(Codes.PAN);
        if(country.equals("Papua New Guinea"))
            phoneEdittext.setCode(Codes.PNG);
        if(country.equals("Paraguay"))
            phoneEdittext.setCode(Codes.PRY);
        if(country.equals("Peru"))
            phoneEdittext.setCode(Codes.PER);
        if(country.equals("Philippines"))
            phoneEdittext.setCode(Codes.PHL);
        if(country.equals("Pitcairn"))
            phoneEdittext.setCode(Codes.PCN);
        if(country.equals("Poland"))
            phoneEdittext.setCode(Codes.POL);
        if(country.equals("Portugal"))
            phoneEdittext.setCode(Codes.PRT);
        if(country.equals("Puerto Rico"))
            phoneEdittext.setCode(Codes.PRI);
        if(country.equals("Qatar"))
            phoneEdittext.setCode(Codes.QAT);
        if(country.equals("Republic of the Congo"))
            phoneEdittext.setCode(Codes.COG);
        if(country.equals("Reunion"))
            phoneEdittext.setCode(Codes.REU);
        if(country.equals("Romania"))
            phoneEdittext.setCode(Codes.ROU);
        if(country.equals("Russia"))
            phoneEdittext.setCode(Codes.RUS);
        if(country.equals("Rwanda"))
            phoneEdittext.setCode(Codes.RWA);
        if(country.equals("Saint Barthelemy"))
            phoneEdittext.setCode(Codes.BLM);
        if(country.equals("Saint Helena"))
            phoneEdittext.setCode(Codes.SHN);
        if(country.equals("Saint Kitts and Nevis"))
            phoneEdittext.setCode(Codes.KNA);
        if(country.equals("Saint Lucia"))
            phoneEdittext.setCode(Codes.LCA);
        if(country.equals("Saint Martin"))
            phoneEdittext.setCode(Codes.MAF);
        if(country.equals("Saint Pierre and Miquelon"))
            phoneEdittext.setCode(Codes.SPM);
        if(country.equals("Saint Vincent and the Grenadines"))
            phoneEdittext.setCode(Codes.VCT);
        if(country.equals("Samoa"))
            phoneEdittext.setCode(Codes.WSM);
        if(country.equals("San Marino"))
            phoneEdittext.setCode(Codes.SMR);
        if(country.equals("Sao Tome and Principe"))
            phoneEdittext.setCode(Codes.STP);
        if(country.equals("Saudi Arabia"))
            phoneEdittext.setCode(Codes.SAU);
        if(country.equals("Senegal"))
            phoneEdittext.setCode(Codes.SEN);
        if(country.equals("Serbia"))
            phoneEdittext.setCode(Codes.SRB);
        if(country.equals("Seychelles"))
            phoneEdittext.setCode(Codes.SYC);
        if(country.equals("Sierra Leone"))
            phoneEdittext.setCode(Codes.SLE);
        if(country.equals("Singapore"))
            phoneEdittext.setCode(Codes.SGP);
        if(country.equals("Sint Maarten"))
            phoneEdittext.setCode(Codes.SXM);
        if(country.equals("Slovakia"))
            phoneEdittext.setCode(Codes.SVK);
        if(country.equals("Slovenia"))
            phoneEdittext.setCode(Codes.SVN);
        if(country.equals("Solomon Islands"))
            phoneEdittext.setCode(Codes.SLB);
        if(country.equals("Somalia"))
            phoneEdittext.setCode(Codes.SOM);
        if(country.equals("South Africa"))
            phoneEdittext.setCode(Codes.ZAF);
        if(country.equals("South Korea"))
            phoneEdittext.setCode(Codes.KOR);
        if(country.equals("South Sudan"))
            phoneEdittext.setCode(Codes.SSD);
        if(country.equals("Spain"))
            phoneEdittext.setCode(Codes.ESP);
        if(country.equals("Sri Lanka"))
            phoneEdittext.setCode(Codes.LKA);
        if(country.equals("Sudan"))
            phoneEdittext.setCode(Codes.SDN);
        if(country.equals("Suriname"))
            phoneEdittext.setCode(Codes.SUR);
        if(country.equals("Svalbard and Jan Mayen"))
            phoneEdittext.setCode(Codes.SJM);
        if(country.equals("Swaziland"))
            phoneEdittext.setCode(Codes.SWZ);
        if(country.equals("Sweden"))
            phoneEdittext.setCode(Codes.SWE);
        if(country.equals("Switzerland"))
            phoneEdittext.setCode(Codes.CHE);
        if(country.equals("Syria"))
            phoneEdittext.setCode(Codes.SYR);
        if(country.equals("Taiwan"))
            phoneEdittext.setCode(Codes.TWN);
        if(country.equals("Tajikistan"))
            phoneEdittext.setCode(Codes.TJK);
        if(country.equals("Tanzania"))
            phoneEdittext.setCode(Codes.TZA);
        if(country.equals("Thailand"))
            phoneEdittext.setCode(Codes.THA);
        if(country.equals("Togo"))
            phoneEdittext.setCode(Codes.TGO);
        if(country.equals("Tokelau"))
            phoneEdittext.setCode(Codes.TKL);
        if(country.equals("Tonga"))
            phoneEdittext.setCode(Codes.TON);
        if(country.equals("Trinidad and Tobago"))
            phoneEdittext.setCode(Codes.TTO);
        if(country.equals("Tunisia"))
            phoneEdittext.setCode(Codes.TUN);
        if(country.equals("Turkey"))
            phoneEdittext.setCode(Codes.TUR);
        if(country.equals("Turkmenistan"))
            phoneEdittext.setCode(Codes.TKM);
        if(country.equals("Turks and Caicos Islands"))
            phoneEdittext.setCode(Codes.TCA);
        if(country.equals("Tuvalu"))
            phoneEdittext.setCode(Codes.TUV);
        if(country.equals("U.S. Virgin Islands"))
            phoneEdittext.setCode(Codes.VIR);
        if(country.equals("Uganda"))
            phoneEdittext.setCode(Codes.UGA);
        if(country.equals("Ukraine"))
            phoneEdittext.setCode(Codes.UKR);
        if(country.equals("United Arab Emirates"))
            phoneEdittext.setCode(Codes.ARE);
        if(country.equals("United Kingdom"))
            phoneEdittext.setCode(Codes.GBR);
        if(country.equals("United States"))
            phoneEdittext.setCode(Codes.USA);
        if(country.equals("Uruguay"))
            phoneEdittext.setCode(Codes.URY);
        if(country.equals("Uzbekistan"))
            phoneEdittext.setCode(Codes.UZB);
        if(country.equals("Vanuatu"))
            phoneEdittext.setCode(Codes.VUT);
        if(country.equals("Vatican"))
            phoneEdittext.setCode(Codes.VAT);
        if(country.equals("Venezuela"))
            phoneEdittext.setCode(Codes.VEN);
        if(country.equals("Vietnam"))
            phoneEdittext.setCode(Codes.VNM);
        if(country.equals("Wallis and Futuna"))
            phoneEdittext.setCode(Codes.WLF);
        if(country.equals("Western Sahara"))
            phoneEdittext.setCode(Codes.ESH);
        if(country.equals("Yemen"))
            phoneEdittext.setCode(Codes.YEM);
        if(country.equals("Zambia"))
            phoneEdittext.setCode(Codes.ZMB);
        if(country.equals("Zimbabw"))
            phoneEdittext.setCode(Codes.ZWE);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {}
}
