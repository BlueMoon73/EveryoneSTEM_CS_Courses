import cv2
import numpy as np

# Creating a black image (700*700)
image = np.zeros((700, 700, 3))

# Drawing a circle (img, coords, radius, color, width)
cv2.circle(image, (300, 300), 20, (255, 0, 0), 3)

# Drawing a rectangle (img, start, end, color, width)
cv2.rectangle(image, (200, 5), (400, 120), (0, 0, 255), 10)

# Drawing a line (img, start, end, color, width)
cv2.line(image, (400, 300), (500, 400), (0, 0, 255), 20)

# Adding text (img, text, coord, font, fontSize, color)
cv2.putText(image, "Hello World!", (200, 100), fontFace=cv2.FONT_HERSHEY_COMPLEX, fontScale=1, color=(0, 0, 255))

# Adding ellipse (img, centerCoords, axesLength, angle, startAngle, endAngle, color, width)
cv2.ellipse(image, (200, 500), (100, 150), 0, 0, 360, 255, -1)

# Save the image as `MyImage.png`
cv2.imwrite('MyImage.png', image)

# Show the img
cv2.imshow('Image', image)

cv2.waitKey()
cv2.destroyAllWindows()
