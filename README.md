<p style="font-size: 24px; color: #ff9900; font-weight: bold;">The Problem</p>
<p><span style="font-size: 14px;">Know this annoying big red <span style="color: #ff0000;"><strong>X</strong></span> even when your client has exactly the same mods as the server?</span></p>
<p><img src="https://cdn.discordapp.com/attachments/823563269619843183/913792568351936522/unknown.png" alt="incompatible" width="72" height="49" /></p>
<ul>
<li><span style="font-size: 14px;">Well, this is because there is a size limit in minecraft on how much data can be sent for compatibility checks.</span></li>
<li><span style="font-size: 14px;">On top of that forge put a hard limit on the amount of maximum mods that can be checked for compatibility (so you do not hit the packet limit and crash)</span></li>
<li><span style="font-size: 14px;">If you have any more mods than 160, the compatibility check automatically fails. This is in forge &gt;= 36.1.32.</span></li>
</ul>
<p>&nbsp;</p>
<p style="font-size: 24px; color: #008080; font-weight: bold;">The Solution</p>
<ul>
<li><span style="font-size: 14px;"><span style="color: #008000;">Actually Compatible</span> increases the compatibility check packet size significantly. (from 32KB to 100KB by default)</span></li>
<li><span style="font-size: 14px;">You can also provide your own new packet size in the config file.</span></li>
<li><span style="font-size: 14px;">And last but not the least, the mod removes&nbsp; the hard 160 mod limit put in by forge.</span></li>
</ul>
<p>&nbsp;</p>
<p><span style="font-size: 14px;">All of the fixes mentioned above, together fix the compatibility checks.</span></p>
<p><span style="font-size: 14px;">You will receive proper list of incompatible mods in your client logs.</span></p>
<p><span style="font-size: 14px;">And, once you have actually compatible list of mods, the big red angry <span style="color: #ff0000;">X</span> turns into the happy green <span style="font-size: 24px;"><span style="color: #008000; font-size: 24px;">✓</span></span></span></p>
<p><span style="font-size: 14px;"><img src="https://cdn.discordapp.com/attachments/871325791303110686/914510624933965824/unknown.png" alt="check" width="74" height="51" /></span></p>
<p>&nbsp;</p>
<p style="font-size: 24px; color: #008080; font-weight: bold;">Compatibility</p>
<p><span style="font-size: 14px;">The same fix is being used in my modpack <a style="font-size: 18px; color: teal; font-weight: bold;" href="https://www.curseforge.com/minecraft/modpacks/starpack-titan-mc1-16">Starpack Titan</a> with <span style="color: orange;"> 600+</span> mods and it gives perfectly accurate checks. </span><br /> <span style="font-size: 14px;">If you discover an issue, please report from the issues tab above.</span></p>
<p>&nbsp;</p>
